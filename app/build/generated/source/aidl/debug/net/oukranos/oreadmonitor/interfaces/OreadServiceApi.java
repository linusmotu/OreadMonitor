/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/francis/Workspace/AndroidStudioProjects/OreadMonitor/app/src/main/aidl/net/oukranos/oreadmonitor/interfaces/OreadServiceApi.aidl
 */
package net.oukranos.oreadmonitor.interfaces;
public interface OreadServiceApi extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements net.oukranos.oreadmonitor.interfaces.OreadServiceApi
{
private static final java.lang.String DESCRIPTOR = "net.oukranos.oreadmonitor.interfaces.OreadServiceApi";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an net.oukranos.oreadmonitor.interfaces.OreadServiceApi interface,
 * generating a proxy if needed.
 */
public static net.oukranos.oreadmonitor.interfaces.OreadServiceApi asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof net.oukranos.oreadmonitor.interfaces.OreadServiceApi))) {
return ((net.oukranos.oreadmonitor.interfaces.OreadServiceApi)iin);
}
return new net.oukranos.oreadmonitor.interfaces.OreadServiceApi.Stub.Proxy(obj);
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
case TRANSACTION_start:
{
data.enforceInterface(DESCRIPTOR);
this.start();
reply.writeNoException();
return true;
}
case TRANSACTION_stop:
{
data.enforceInterface(DESCRIPTOR);
this.stop();
reply.writeNoException();
return true;
}
case TRANSACTION_runCommand:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.runCommand(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getData:
{
data.enforceInterface(DESCRIPTOR);
net.oukranos.oreadmonitor.types.OreadServiceWaterQualityData _result = this.getData();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getStatus:
{
data.enforceInterface(DESCRIPTOR);
net.oukranos.oreadmonitor.types.OreadServiceControllerStatus _result = this.getStatus();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getLogs:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getLogs(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_addListener:
{
data.enforceInterface(DESCRIPTOR);
net.oukranos.oreadmonitor.interfaces.OreadServiceListener _arg0;
_arg0 = net.oukranos.oreadmonitor.interfaces.OreadServiceListener.Stub.asInterface(data.readStrongBinder());
this.addListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_removeListener:
{
data.enforceInterface(DESCRIPTOR);
net.oukranos.oreadmonitor.interfaces.OreadServiceListener _arg0;
_arg0 = net.oukranos.oreadmonitor.interfaces.OreadServiceListener.Stub.asInterface(data.readStrongBinder());
this.removeListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getProcStates:
{
data.enforceInterface(DESCRIPTOR);
net.oukranos.oreadmonitor.types.OreadServiceProcStateChangeInfo _result = this.getProcStates();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getProc:
{
data.enforceInterface(DESCRIPTOR);
net.oukranos.oreadmonitor.types.OreadServiceProcChangeInfo _result = this.getProc();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getTask:
{
data.enforceInterface(DESCRIPTOR);
net.oukranos.oreadmonitor.types.OreadServiceTaskChangeInfo _result = this.getTask();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements net.oukranos.oreadmonitor.interfaces.OreadServiceApi
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
@Override public void start() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_start, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stop() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stop, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String runCommand(java.lang.String command, java.lang.String params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(command);
_data.writeString(params);
mRemote.transact(Stub.TRANSACTION_runCommand, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public net.oukranos.oreadmonitor.types.OreadServiceWaterQualityData getData() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
net.oukranos.oreadmonitor.types.OreadServiceWaterQualityData _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getData, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = net.oukranos.oreadmonitor.types.OreadServiceWaterQualityData.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public net.oukranos.oreadmonitor.types.OreadServiceControllerStatus getStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
net.oukranos.oreadmonitor.types.OreadServiceControllerStatus _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getStatus, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = net.oukranos.oreadmonitor.types.OreadServiceControllerStatus.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getLogs(int lines) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(lines);
mRemote.transact(Stub.TRANSACTION_getLogs, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void addListener(net.oukranos.oreadmonitor.interfaces.OreadServiceListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeListener(net.oukranos.oreadmonitor.interfaces.OreadServiceListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_removeListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public net.oukranos.oreadmonitor.types.OreadServiceProcStateChangeInfo getProcStates() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
net.oukranos.oreadmonitor.types.OreadServiceProcStateChangeInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getProcStates, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = net.oukranos.oreadmonitor.types.OreadServiceProcStateChangeInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public net.oukranos.oreadmonitor.types.OreadServiceProcChangeInfo getProc() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
net.oukranos.oreadmonitor.types.OreadServiceProcChangeInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getProc, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = net.oukranos.oreadmonitor.types.OreadServiceProcChangeInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public net.oukranos.oreadmonitor.types.OreadServiceTaskChangeInfo getTask() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
net.oukranos.oreadmonitor.types.OreadServiceTaskChangeInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTask, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = net.oukranos.oreadmonitor.types.OreadServiceTaskChangeInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_start = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_runCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getLogs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_addListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_removeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getProcStates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getProc = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getTask = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
public void start() throws android.os.RemoteException;
public void stop() throws android.os.RemoteException;
public java.lang.String runCommand(java.lang.String command, java.lang.String params) throws android.os.RemoteException;
public net.oukranos.oreadmonitor.types.OreadServiceWaterQualityData getData() throws android.os.RemoteException;
public net.oukranos.oreadmonitor.types.OreadServiceControllerStatus getStatus() throws android.os.RemoteException;
public java.lang.String getLogs(int lines) throws android.os.RemoteException;
public void addListener(net.oukranos.oreadmonitor.interfaces.OreadServiceListener listener) throws android.os.RemoteException;
public void removeListener(net.oukranos.oreadmonitor.interfaces.OreadServiceListener listener) throws android.os.RemoteException;
public net.oukranos.oreadmonitor.types.OreadServiceProcStateChangeInfo getProcStates() throws android.os.RemoteException;
public net.oukranos.oreadmonitor.types.OreadServiceProcChangeInfo getProc() throws android.os.RemoteException;
public net.oukranos.oreadmonitor.types.OreadServiceTaskChangeInfo getTask() throws android.os.RemoteException;
}
