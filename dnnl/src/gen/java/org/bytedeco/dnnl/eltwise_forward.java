// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_pooling
 <p>
 *  \addtogroup dnnl_api_eltwise Eltwise
 * 
 *  A primitive to perform elementwise operations such as the
 *  rectifier linear unit (ReLU).
 * 
 *  Both forward and backward propagation primitives support in-place
 *  operation; that is, src and dst can refer to the same memory for forward
 *  propagation, and diff_dst and diff_src can refer to the same memory for
 *  backward propagation.
 * 
 *  \warning
 *      Because the original source data is required for backward propagation,
 *      in-place forward propagation is not generally supported in the
 *      training mode.  However, for namely ReLU with the alpha parameter set
 *      to 0, either dst or src can be used for the backward propagation,
 *      which makes it possible to get performance benefit even in the
 *      training mode.
 * 
 *  @see \ref dev_guide_eltwise in developer guide
 * 
 *  \{
 <p>
 *  Elementwise unary operation forward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class eltwise_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public eltwise_forward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public eltwise_forward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public eltwise_forward position(long position) {
        return (eltwise_forward)super.position(position);
    }

    /** Descriptor for an elementwise forward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        ///
        ///
        public native @ByRef dnnl_eltwise_desc_t data(); public native desc data(dnnl_eltwise_desc_t setter);

        /** Constructs a descriptor for an elementwise forward propagation
         *  primitive.
         * 
         *  Inputs:
         *   - src (#dnnl::primitive_desc_base::src_desc (0))
         * 
         *  Outputs:
         *   - dst (#dnnl::primitive_desc_base::dst_desc (0))
         * 
         *  @param prop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::forward_training, and
         *      #dnnl::prop_kind::forward_inference.
         *  @param algorithm Elementwise algorithm kind.
         *  @param data_desc Source and destination memory descriptors.
         *  @param alpha The alpha parameter for the elementwise operation.
         *      Specific meaning depends on the algorithm.
         *  @param beta The beta parameter for the elementwise operation.
         *      Specific meaning depends on the algorithm. */
        public desc(prop_kind prop_kind, algorithm algorithm,
                        @Const @ByRef memory.desc data_desc, float alpha/*=0*/,
                        float beta/*=0*/) { super((Pointer)null); allocate(prop_kind, algorithm, data_desc, alpha, beta); }
        private native void allocate(prop_kind prop_kind, algorithm algorithm,
                        @Const @ByRef memory.desc data_desc, float alpha/*=0*/,
                        float beta/*=0*/);
        public desc(@Cast("dnnl::prop_kind") int prop_kind, @Cast("dnnl::algorithm") int algorithm,
                        @Const @ByRef memory.desc data_desc, float alpha/*=0*/,
                        float beta/*=0*/) { super((Pointer)null); allocate(prop_kind, algorithm, data_desc, alpha, beta); }
        private native void allocate(@Cast("dnnl::prop_kind") int prop_kind, @Cast("dnnl::algorithm") int algorithm,
                        @Const @ByRef memory.desc data_desc, float alpha/*=0*/,
                        float beta/*=0*/);
    }

    /** Primitive descriptor for an elementwise forward propagation primitive. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for an elementwise forward
         *  propagation primitive.
         * 
         *  @param desc Descriptor for an elementwise forward propagation
         *      primitive.
         *  @param engine Engine to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, engine, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine engine,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine engine) { super((Pointer)null); allocate(desc, engine); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine engine);

        /** Constructs a primitive descriptor for an elementwise forward
         *  propagation primitive.
         * 
         *  @param desc Descriptor for an elementwise forward propagation
         *      primitive.
         *  @param engine Engine to use.
         *  @param attr Primitive attributes to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine, @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, attr, engine, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine, @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine) { super((Pointer)null); allocate(desc, attr, engine); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine engine);

        /** Constructs a primitive descriptor for an eltwise forward
         *  propagation primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for an eltwise forward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::src_desc()const */
        public native @ByVal memory.desc src_desc();

        /** \copydoc dnnl::primitive_desc_base::dst_desc()const */
        public native @ByVal memory.desc dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public eltwise_forward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs an eltwise forward propagation primitive.
     *  @param pd Primitive descriptor for an eltwise forward propagation
     *      primitive. */
    public eltwise_forward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
