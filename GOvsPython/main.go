package main

import (
	"fmt"
	"math/rand"
	"runtime"
	"time"
)

func main() {
	runtime.GOMAXPROCS(runtime.NumCPU())
	var mStart, mEnd runtime.MemStats
	runtime.ReadMemStats(&mStart)

	start := time.Now()

	arr := make([]int, 10_000_000)
	for i := range arr {
		arr[i] = rand.Intn(1_000_000)
	}

	// Sort (to stress CPU)
	for i := 0; i < len(arr); i++ {
		for j := i + 1; j < len(arr); j++ {
			if arr[i] > arr[j] {
				arr[i], arr[j] = arr[j], arr[i]
			}
		}
	}

	duration := time.Since(start)
	runtime.ReadMemStats(&mEnd)

	fmt.Printf("Time taken: %.2fs\n", duration.Seconds())
	fmt.Printf("Memory used: %.2f MB\n", float64(mEnd.Alloc-mStart.Alloc)/1024/1024)
}
