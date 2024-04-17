package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import androidx.compose.foundation.layout.e1;
import com.withings.common.compose.component.CellVerticalMargin;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.Map;
/* compiled from: ToiletCloseDeviceScreen.kt */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f55351a = new s1.a(false, 1111007951, a.f55354a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f55352b = new s1.a(false, 408412112, b.f55355a);

    /* renamed from: c  reason: collision with root package name */
    public static s1.a f55353c = new s1.a(false, -1323589482, C0732c.f55356a);

    /* compiled from: ToiletCloseDeviceScreen.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55354a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                n0.z.a(s2.d.a(2131232931, aVar2), null, androidx.compose.foundation.layout.w0.a(e1.d(androidx.compose.ui.e.f8927a), 1.0f), null, null, 0.0f, null, aVar2, 440, 120);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ToiletCloseDeviceScreen.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f55355a = new kotlin.jvm.internal.w(2);

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                v4.b(null, ay.b.u(C1987R.string.wpa02_closeUScan_title, aVar2), null, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ToiletCloseDeviceScreen.kt */
    /* renamed from: com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0732c extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0732c f55356a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                for (Map.Entry entry : kotlin.collections.s0.j(new nm0.j(Integer.valueOf((int) C1987R.string.wpa02_closeUScan_description_1), 2131232945), new nm0.j(Integer.valueOf((int) C1987R.string.wpa02_closeUScan_description_2), 2131232932), new nm0.j(Integer.valueOf((int) C1987R.string.wpa02_closeUScan_description_3), 2131232948)).entrySet()) {
                    com.withings.common.compose.component.o.q(null, s2.d.a(((Number) entry.getValue()).intValue(), aVar2), ay.b.u(((Number) entry.getKey()).intValue(), aVar2), null, false, false, false, null, CellVerticalMargin.f33312d, aVar2, 100663360, ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT);
                }
            }
            return nm0.y.f85009a;
        }
    }
}
