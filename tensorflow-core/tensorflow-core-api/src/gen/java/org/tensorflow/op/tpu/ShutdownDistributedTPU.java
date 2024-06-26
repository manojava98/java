/* Copyright 2018-2023 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.tpu;

import java.util.Arrays;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.OpInputsMetadata;
import org.tensorflow.op.annotation.OpMetadata;
import org.tensorflow.op.annotation.Operator;

/**
 * Shuts down a running distributed TPU system.
 * The op returns an error if no system is running.
 */
@OpMetadata(
    opType = ShutdownDistributedTPU.OP_NAME,
    inputsClass = ShutdownDistributedTPU.Inputs.class
)
@Operator(
    group = "tpu"
)
public final class ShutdownDistributedTPU extends RawOp {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "ShutdownDistributedTPU";

  public ShutdownDistributedTPU(Operation operation) {
    super(operation, OP_NAME);
  }

  /**
   * Factory method to create a class wrapping a new ShutdownDistributedTPU operation.
   *
   * @param scope current scope
   * @return a new instance of ShutdownDistributedTPU
   */
  @Endpoint(
      describeByClass = true
  )
  public static ShutdownDistributedTPU create(Scope scope) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "ShutdownDistributedTPU");
    return new ShutdownDistributedTPU(opBuilder.build());
  }

  @OpInputsMetadata(
      outputsClass = ShutdownDistributedTPU.class
  )
  public static class Inputs extends RawOpInputs<ShutdownDistributedTPU> {
    public Inputs(GraphOperation op) {
      super(new ShutdownDistributedTPU(op), op, Arrays.asList());
      int inputIndex = 0;
    }
  }
}
