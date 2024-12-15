/*
 * Copyright 2020 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.tensorflow

actual class InterpreterOptions(
    numThreads: Int,
    useNNAPI: Boolean = false,
    allowFp16PrecisionForFp32: Boolean = false,
    allowBufferHandleOutput: Boolean = false,
    delegates: List<Delegate> = emptyList()
) {
    actual constructor(numThreads: Int) : this(numThreads, false)

    internal val tensorFlowInterpreterOptions = PlatformInterpreterOptions()
        .setNumThreads(numThreads)
        .setAllowBufferHandleOutput(allowBufferHandleOutput)
        .setUseNNAPI(useNNAPI)
        .apply {
            delegates.forEach {
                addDelegate(PlatformTensorFlowDelegate { it.getNativeHandle() })
            }
        }
}
