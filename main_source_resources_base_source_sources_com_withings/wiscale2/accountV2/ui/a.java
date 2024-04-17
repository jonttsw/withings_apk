package com.withings.wiscale2.accountV2.ui;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.ui.layout.f;
import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import n0.z;
import nm0.y;
import x1.b;
import ym0.p;
import ym0.q;
/* compiled from: LoggedOutActivity.kt */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static s1.a f48201a = new s1.a(false, 1933744192, C0664a.f48204a);

    /* renamed from: b  reason: collision with root package name */
    public static s1.a f48202b = new s1.a(false, 1801420447, b.f48205a);

    /* renamed from: c  reason: collision with root package name */
    public static s1.a f48203c = new s1.a(false, 2135677465, c.f48206a);

    /* compiled from: LoggedOutActivity.kt */
    /* renamed from: com.withings.wiscale2.accountV2.ui.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0664a extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0664a f48204a = new w(2);

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                z.a(s2.d.a(2131232248, aVar2), "", x0.h(e1.e(androidx.compose.ui.e.f8927a, 1.0f), 0.0f, yk.h.u(), 1), b.a.b(), f.a.c(), 0.0f, null, aVar2, 27704, 96);
            }
            return y.f85009a;
        }
    }

    /* compiled from: LoggedOutActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f48205a = new w(2);

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                v4.b(null, ay.b.u(C1987R.string.login_revokeProviderToken_title, aVar2), null, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED);
            }
            return y.f85009a;
        }
    }

    /* compiled from: LoggedOutActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f48206a = new w(3);

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                nk.a.d(x0.g(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.B()), ay.b.u(C1987R.string.login_revokeProviderToken_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 124);
            }
            return y.f85009a;
        }
    }
}
