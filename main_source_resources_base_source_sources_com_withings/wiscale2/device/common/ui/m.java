package com.withings.wiscale2.device.common.ui;

import android.widget.Toast;
import com.withings.device.ws.Association;
import com.withings.device.ws.Associations;
import com.withings.device.ws.DeviceApi;
import com.withings.views.widget.LineCellView;
import com.withings.webservices.legacy.Webservices;
import com.withings.wiscale2.C1987R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: BaseDeviceInfoFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.BaseDeviceInfoFragment$saveNewName$1", f = "BaseDeviceInfoFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class m extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f54019a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f54020b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LineCellView f54021c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f54022d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, String str, LineCellView lineCellView, String str2, qm0.d<? super m> dVar) {
        super(2, dVar);
        this.f54019a = hVar;
        this.f54020b = str;
        this.f54021c = lineCellView;
        this.f54022d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new m(this.f54019a, this.f54020b, this.f54021c, this.f54022d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((m) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        DeviceApi deviceApi;
        Associations associationForDevice$default;
        vf.c cVar;
        Object obj2;
        h hVar = this.f54019a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        String str = this.f54020b;
        try {
            deviceApi = (DeviceApi) Webservices.get().getApiForAccount(DeviceApi.class);
            kotlin.jvm.internal.u.g(deviceApi);
            associationForDevice$default = DeviceApi.getAssociationForDevice$default(deviceApi, hVar.F1().getId(), null, 2, null);
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (!associationForDevice$default.list.isEmpty()) {
            cVar = vf.c.f103617d;
            if (cVar != null) {
                long b10 = cVar.h().i().b();
                List<Association> list = associationForDevice$default.list;
                kotlin.jvm.internal.u.i(list, "list");
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((Association) obj2).accountid == b10) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                Association association = (Association) obj2;
                if (association != null) {
                    hVar.F1().setName(str);
                    long j5 = association.associationid;
                    String name = hVar.F1().getName();
                    kotlin.jvm.internal.u.i(name, "getName(...)");
                    deviceApi.updateAssociation(j5, name, null);
                    hVar.G1().t(hVar.F1());
                    a11 = nm0.y.f85009a;
                    if (nm0.k.b(a11) != null) {
                        LineCellView lineCellView = this.f54021c;
                        Toast.makeText(lineCellView.getContext(), (int) C1987R.string._ERROR_CONNECTION_TIMEOUT_, 0).show();
                        String str2 = this.f54022d;
                        lineCellView.setValue(str2);
                        hVar.F1().setName(str2);
                    }
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException(String.format("Device %d is not associated to account %d", Arrays.copyOf(new Object[]{new Long(hVar.F1().getId()), new Long(b10)}, 2)));
            }
            throw new IllegalArgumentException("You must call init before".toString());
        }
        throw new IllegalStateException("Device is not associated to any account... weird...");
    }
}
