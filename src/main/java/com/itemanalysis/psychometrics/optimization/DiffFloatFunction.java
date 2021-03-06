/**
 * Copyright 2014 J. Patrick Meyer
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.itemanalysis.psychometrics.optimization;

/**
 * An interface for once-differentiable double-valued functions over
 * double arrays.  NOTE: it'd be good to have an AbstractDiffFunction
 * that wrapped a Function with a finite-difference approximation.
 *
 * @author <a href="mailto:klein@cs.stanford.edu">Dan Klein</a>
 * @version 1.0
 * @see Function
 * @since 1.0
 */
public interface DiffFloatFunction extends FloatFunction {
    /**
     * Returns the first-derivative vector at the input location.
     *
     * @param x a <code>double[]</code> input vector
     * @return the vector of first partial derivatives.
     */
    float[] derivativeAt(float[] x);
}

