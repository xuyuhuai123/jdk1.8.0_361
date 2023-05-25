package org.omg.PortableServer;


/**
* org/omg/PortableServer/POAManagerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-x64/jdk8u361/3183/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Monday, January 9, 2023 8:31:50 AM GMT
*/


/**
	 * Each POA object has an associated POAManager object. 
	 * A POA manager may be associated with one or more 
	 * POA objects. A POA manager encapsulates the processing 
	 * state of the POAs it is associated with.
	 */
public interface POAManagerOperations 
{

  /**
  	 * This operation changes the state of the POA manager 
  	 * to active, causing associated POAs to start processing
  	 * requests.
  	 * @exception AdapterInactive is raised if the operation is
  	 *            invoked on the POAManager in inactive state.
  	 */
  void activate () throws org.omg.PortableServer.POAManagerPackage.AdapterInactive;

  /**
  	 * This operation changes the state of the POA manager 
  	 * to holding, causing associated POAs to queue incoming
  	 * requests.
  	 * @param wait_for_completion if FALSE, the operation 
  	 *            returns immediately after changing state.  
  	 *            If TRUE, it waits for all active requests 
  	 *            to complete. 
  	 * @exception AdapterInactive is raised if the operation is
  	 *            invoked on the POAManager in inactive state.
  	 */
  void hold_requests (boolean wait_for_completion) throws org.omg.PortableServer.POAManagerPackage.AdapterInactive;

  /**
  	 * This operation changes the state of the POA manager 
  	 * to discarding. This causes associated POAs to discard
  	 * incoming requests.
  	 * @param wait_for_completion if FALSE, the operation 
  	 *            returns immediately after changing state.  
  	 *            If TRUE, it waits for all active requests 
  	 *            to complete. 
  	 * @exception AdapterInactive is raised if the operation is
  	 *            invoked on the POAManager in inactive state.
  	 */
  void discard_requests (boolean wait_for_completion) throws org.omg.PortableServer.POAManagerPackage.AdapterInactive;

  /**
  	 * This operation changes the state of the POA manager 
  	 * to inactive, causing associated POAs to reject the
  	 * requests that have not begun executing as well as
  	 * as any new requests.
  	 * @param etherealize_objects a flag to indicate whether
  	 *        to invoke the etherealize operation of the
  	 *        associated servant manager for all active 
  	 *        objects.
  	 * @param wait_for_completion if FALSE, the operation 
  	 *            returns immediately after changing state.  
  	 *            If TRUE, it waits for all active requests 
  	 *            to complete. 
  	 * @exception AdapterInactive is raised if the operation is
  	 *            invoked on the POAManager in inactive state.
  	 */
  void deactivate (boolean etherealize_objects, boolean wait_for_completion) throws org.omg.PortableServer.POAManagerPackage.AdapterInactive;

  /**
  	 * This operation returns the state of the POA manager.
  	 */
  org.omg.PortableServer.POAManagerPackage.State get_state ();
} // interface POAManagerOperations
