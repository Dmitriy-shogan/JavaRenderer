package org.cxxnative;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

@Platform(include ="JavaWorks.h")
public class HelloTriangleApplication extends Pointer {

    static { Loader.load(); }
    public HelloTriangleApplication() { allocate(); }
    private native void allocate();

    public native void run();
}
