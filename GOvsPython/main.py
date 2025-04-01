from memory_profiler import profile
import time
import psutil
import os

@profile
def benchmark_sort():
    import random
    arr = [random.randint(0, 10**6) for _ in range(10**7)]
    arr.sort()

if __name__ == "__main__":
    process = psutil.Process(os.getpid())
    cpu_before = process.cpu_percent(interval=None)
    mem_before = process.memory_info().rss / (1024 * 1024)

    start = time.time()
    benchmark_sort()
    end = time.time()

    cpu_after = process.cpu_percent(interval=1)
    mem_after = process.memory_info().rss / (1024 * 1024)

    print(f"\nTime taken: {end - start:.2f}s")
    print(f"CPU usage: {cpu_after:.2f}%")
    print(f"Memory used: {mem_after - mem_before:.2f} MB")
