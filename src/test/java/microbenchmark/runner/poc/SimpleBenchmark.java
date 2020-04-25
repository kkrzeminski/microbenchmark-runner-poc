package microbenchmark.runner.poc;

import jmh.mbr.junit5.Microbenchmark;
import org.junit.platform.commons.annotation.Testable;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@Microbenchmark
public class SimpleBenchmark {

    @State(Scope.Benchmark)
    static class MyParameters {

        @Param({"1", "10", "100"})  // renders parametrized benchmarks as sub-tests
                String batchSize;
    }

    @Testable
    @Benchmark
    public void foo(MyParameters myParameters) {}
}
