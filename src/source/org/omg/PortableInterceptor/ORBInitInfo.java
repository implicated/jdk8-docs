package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ORBInitInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tester/jenkins/workspace/zulu8-build-macos-aarch64/zulu-src/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Thursday, January 13, 2022 6:45:12 AM PST
*/


/** 
   * Passed to each <code>ORBInitializer</code>, allowing it to
   * to register interceptors and perform other duties while the ORB is 
   * initializing.
   * <p>
   * The <code>ORBInitInfo</code> object is only valid during 
   * <code>ORB.init</code>.  If a service keeps a reference to its 
   * <code>ORBInitInfo</code> object and tries to use it after 
   * <code>ORB.init</code> returns, the object no longer exists and an 
   * <code>OBJECT_NOT_EXIST</code> exception shall be thrown.
   *
   * @see ORBInitializer
   */
public interface ORBInitInfo extends ORBInitInfoOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface ORBInitInfo