package org.omg.PortableServer;


/**
* org/omg/PortableServer/POAManager.java .
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
public interface POAManager extends POAManagerOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface POAManager