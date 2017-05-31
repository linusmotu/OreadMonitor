/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/francis/Workspace/AndroidStudioProjects/OreadMonitor/app/src/main/aidl/net/oukranos/oreadmonitor/interfaces/OreadServiceListener.aidl
 */
package net.oukranos.oreadmonitor.interfaces;
public interface OreadServiceListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements net.oukranos.oreadmonitor.interfaces.OreadServiceListener
{
private static final java.lang.String DESCRIPTOR = "net.oukranos.oreadmonitor.interfaces.OreadServiceListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an net.oukranos.oreadmonitor.interfaces.OreadServiceListener interface,
 * generating a proxy if needed.
 */
public static net.oukranos.oreadmonitor.interfaces.OreadServiceListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof net.oukranos.oreadmonitor.interfaces.OreadServiceListener))) {
return ((net.oukranos.oreadmonitor.interfaces.OreadServiceListener)iin);
}
return new net.oukranos.oreadmonitor.interfaces.OreadServiceListener.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_handleWaterQualityData:
{
data.enforceInterface(DESCRIPTOR);
this.handleWaterQualityData();
reply.writeNoException();
return true;
}
case TRANSACTION_handleOperationProcStateChanged:
{
data.enforceInterface(DESCRIPTOR);
this.handleOperationProcStateChanged();
reply.writeNoException();
return true;
}
case TRANSACTION_handleOperationProcChanged:
{
data.enforceInterface(DESCRIPTOR);
this.handleOperationProcChanged();
reply.writeNoException();
return true;
}
case TRANSACTION_handleOperationTaskChanged:
{
data.enforceInterface(DESCRIPTOR);
this.handleOperationTaskChanged();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements net.oukranos.oreadmonitor.interfaces.OreadServiceListener
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void handleWaterQualityData() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_handleWaterQualityData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void handleOperationProcStateChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_handleOperationProcStateChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void handleOperationProcChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_handleOperationProcChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void handleOperationTaskChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_handleOperationTaskChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_handleWaterQualityData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_handleOperationProcStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_handleOperationProcChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_handleOperationTaskChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void handleWaterQualityData() throws android.os.RemoteException;
public void handleOperationProcStateChanged() throws android.os.RemoteException;
public void handleOperationProcChanged() throws android.os.RemoteException;
public void handleOperationTaskChanged() throws android.os.RemoteException;
}
