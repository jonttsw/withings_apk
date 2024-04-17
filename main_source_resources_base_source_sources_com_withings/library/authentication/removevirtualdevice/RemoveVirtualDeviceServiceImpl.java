package com.withings.library.authentication.removevirtualdevice;

import com.withings.library.authentication.api.constant.ApiConstantProvider;
import com.withings.library.authentication.host.app.ApplicationInformationProvider;
import com.withings.library.authentication.host.device.DeviceInformationProvider;
import com.withings.library.authentication.removevirtualdevice.api.virtualdevice.VirtualDeviceApi;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
/* compiled from: RemoveVirtualDeviceServiceImpl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/withings/library/authentication/removevirtualdevice/RemoveVirtualDeviceServiceImpl;", "Lcom/withings/library/authentication/removevirtualdevice/RemoveVirtualDeviceService;", "Lpq0/a;", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "", "removeVirtualDevice", "(Lcom/withings/library/authentication/login/Session;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/removevirtualdevice/api/virtualdevice/VirtualDeviceApi;", "virtualDeviceApi$delegate", "Lnm0/g;", "getVirtualDeviceApi", "()Lcom/withings/library/authentication/removevirtualdevice/api/virtualdevice/VirtualDeviceApi;", "virtualDeviceApi", "Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider$delegate", "getDeviceInformationProvider", "()Lcom/withings/library/authentication/host/device/DeviceInformationProvider;", "deviceInformationProvider", "Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider$delegate", "getApiConstantProvider", "()Lcom/withings/library/authentication/api/constant/ApiConstantProvider;", "apiConstantProvider", "Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider$delegate", "getApplicationInformationProvider", "()Lcom/withings/library/authentication/host/app/ApplicationInformationProvider;", "applicationInformationProvider", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemoveVirtualDeviceServiceImpl implements RemoveVirtualDeviceService, a {
    private final g apiConstantProvider$delegate;
    private final g applicationInformationProvider$delegate;
    private final g deviceInformationProvider$delegate;
    private final g virtualDeviceApi$delegate;

    public RemoveVirtualDeviceServiceImpl() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.virtualDeviceApi$delegate = h.a(lazyThreadSafetyMode, new RemoveVirtualDeviceServiceImpl$special$$inlined$inject$default$1(this, null, null));
        this.deviceInformationProvider$delegate = h.a(lazyThreadSafetyMode, new RemoveVirtualDeviceServiceImpl$special$$inlined$inject$default$2(this, null, null));
        this.apiConstantProvider$delegate = h.a(lazyThreadSafetyMode, new RemoveVirtualDeviceServiceImpl$special$$inlined$inject$default$3(this, null, null));
        this.applicationInformationProvider$delegate = h.a(lazyThreadSafetyMode, new RemoveVirtualDeviceServiceImpl$special$$inlined$inject$default$4(this, null, null));
    }

    private final ApiConstantProvider getApiConstantProvider() {
        return (ApiConstantProvider) this.apiConstantProvider$delegate.getValue();
    }

    private final ApplicationInformationProvider getApplicationInformationProvider() {
        return (ApplicationInformationProvider) this.applicationInformationProvider$delegate.getValue();
    }

    private final DeviceInformationProvider getDeviceInformationProvider() {
        return (DeviceInformationProvider) this.deviceInformationProvider$delegate.getValue();
    }

    private final VirtualDeviceApi getVirtualDeviceApi() {
        return (VirtualDeviceApi) this.virtualDeviceApi$delegate.getValue();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|8|(1:(1:11)(2:17|18))(3:19|20|(1:22))|12|13|14))|24|6|7|8|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
        v9.e.f103480c.a("Error during remove virtual device request");
        r12 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    @Override // com.withings.library.authentication.removevirtualdevice.RemoveVirtualDeviceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object removeVirtualDevice(com.withings.library.authentication.login.Session r14, qm0.d<? super java.lang.Boolean> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.withings.library.authentication.removevirtualdevice.RemoveVirtualDeviceServiceImpl$removeVirtualDevice$1
            if (r0 == 0) goto L14
            r0 = r15
            com.withings.library.authentication.removevirtualdevice.RemoveVirtualDeviceServiceImpl$removeVirtualDevice$1 r0 = (com.withings.library.authentication.removevirtualdevice.RemoveVirtualDeviceServiceImpl$removeVirtualDevice$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r11 = r0
            goto L1a
        L14:
            com.withings.library.authentication.removevirtualdevice.RemoveVirtualDeviceServiceImpl$removeVirtualDevice$1 r0 = new com.withings.library.authentication.removevirtualdevice.RemoveVirtualDeviceServiceImpl$removeVirtualDevice$1
            r0.<init>(r13, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r11.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r11.label
            r12 = 1
            if (r1 == 0) goto L31
            if (r1 != r12) goto L29
            nm0.l.b(r15)     // Catch: java.lang.Exception -> L81
            goto L89
        L29:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L31:
            nm0.l.b(r15)
            com.withings.library.authentication.removevirtualdevice.api.virtualdevice.VirtualDeviceApi r1 = r13.getVirtualDeviceApi()     // Catch: java.lang.Exception -> L81
            java.lang.String r2 = r14.getSessionId()     // Catch: java.lang.Exception -> L81
            com.withings.library.authentication.host.device.DeviceInformationProvider r15 = r13.getDeviceInformationProvider()     // Catch: java.lang.Exception -> L81
            java.lang.String r3 = r15.getDeviceId()     // Catch: java.lang.Exception -> L81
            com.withings.library.authentication.host.device.DeviceInformationProvider r15 = r13.getDeviceInformationProvider()     // Catch: java.lang.Exception -> L81
            java.lang.String r4 = r15.getDeviceModel()     // Catch: java.lang.Exception -> L81
            com.withings.library.authentication.api.constant.ApiConstantProvider r15 = r13.getApiConstantProvider()     // Catch: java.lang.Exception -> L81
            java.lang.String r5 = r15.getType()     // Catch: java.lang.Exception -> L81
            com.withings.library.authentication.api.constant.ApiConstantProvider r15 = r13.getApiConstantProvider()     // Catch: java.lang.Exception -> L81
            java.lang.String r6 = r15.getOS()     // Catch: java.lang.Exception -> L81
            com.withings.library.authentication.host.app.ApplicationInformationProvider r15 = r13.getApplicationInformationProvider()     // Catch: java.lang.Exception -> L81
            java.lang.String r7 = r15.getVersion()     // Catch: java.lang.Exception -> L81
            com.withings.library.authentication.host.app.ApplicationInformationProvider r15 = r13.getApplicationInformationProvider()     // Catch: java.lang.Exception -> L81
            java.lang.String r8 = r15.getName()     // Catch: java.lang.Exception -> L81
            com.withings.library.authentication.host.device.DeviceInformationProvider r15 = r13.getDeviceInformationProvider()     // Catch: java.lang.Exception -> L81
            java.lang.String r9 = r15.getOSVersion()     // Catch: java.lang.Exception -> L81
            com.withings.library.authentication.login.Server r10 = r14.getServer()     // Catch: java.lang.Exception -> L81
            r11.label = r12     // Catch: java.lang.Exception -> L81
            java.lang.Object r14 = r1.deleteVirtualDevice(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L81
            if (r14 != r0) goto L89
            return r0
        L81:
            v9.e$a r14 = v9.e.f103480c
            java.lang.String r15 = "Error during remove virtual device request"
            r14.a(r15)
            r12 = 0
        L89:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.removevirtualdevice.RemoveVirtualDeviceServiceImpl.removeVirtualDevice(com.withings.library.authentication.login.Session, qm0.d):java.lang.Object");
    }
}
