package com.withings.authentication.mfa.main.components;

import ah.o;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import n0.z;
import nm0.y;
import r0.a0;
import ym0.p;
import ym0.q;
/* compiled from: VerificationMethodComponent.kt */
/* loaded from: classes3.dex */
public final class m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerificationMethodComponent.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31716a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f31717b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31718c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f31719d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f31720e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f31721f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z5, ym0.l<? super Boolean, y> lVar, ym0.a<y> aVar, boolean z11, int i11, int i12) {
            super(2);
            this.f31716a = z5;
            this.f31717b = lVar;
            this.f31718c = aVar;
            this.f31719d = z11;
            this.f31720e = i11;
            this.f31721f = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f31720e | 1);
            ym0.a<y> aVar2 = this.f31718c;
            boolean z5 = this.f31719d;
            m.a(this.f31716a, this.f31717b, aVar2, z5, aVar, g11, this.f31721f);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerificationMethodComponent.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31722a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f31723b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31724c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f31725d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f31726e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f31727f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(boolean z5, ym0.l<? super Boolean, y> lVar, ym0.a<y> aVar, boolean z11, int i11, int i12) {
            super(2);
            this.f31722a = z5;
            this.f31723b = lVar;
            this.f31724c = aVar;
            this.f31725d = z11;
            this.f31726e = i11;
            this.f31727f = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f31726e | 1);
            ym0.a<y> aVar2 = this.f31724c;
            boolean z5 = this.f31725d;
            m.b(this.f31722a, this.f31723b, aVar2, z5, aVar, g11, this.f31727f);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerificationMethodComponent.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements ym0.l<Boolean, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f31728a = new w(1);

        @Override // ym0.l
        public final /* bridge */ /* synthetic */ y invoke(Boolean bool) {
            bool.booleanValue();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerificationMethodComponent.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements q<a0, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VerificationMethodContent f31729a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(VerificationMethodContent verificationMethodContent) {
            super(3);
            this.f31729a = verificationMethodContent;
        }

        @Override // ym0.q
        public final y invoke(a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            a0 LabelCheckBoxCell = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(LabelCheckBoxCell, "$this$LabelCheckBoxCell");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                z.a(s2.d.a(this.f31729a.d(), aVar2), null, e1.n(x0.j(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 0.0f, 0.0f, 14), yk.h.z()), null, null, 0.0f, null, aVar2, 56, 120);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerificationMethodComponent.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31730a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31731b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ym0.a aVar, boolean z5) {
            super(0);
            this.f31730a = z5;
            this.f31731b = aVar;
        }

        @Override // ym0.a
        public final y invoke() {
            if (this.f31730a) {
                this.f31731b.invoke();
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerificationMethodComponent.kt */
    /* loaded from: classes3.dex */
    public static final class f extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VerificationMethodContent f31732a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f31733b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f31734c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31735d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f31736e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f31737f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f31738g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f31739h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(VerificationMethodContent verificationMethodContent, boolean z5, boolean z11, ym0.a<y> aVar, ym0.l<? super Boolean, y> lVar, boolean z12, int i11, int i12) {
            super(2);
            this.f31732a = verificationMethodContent;
            this.f31733b = z5;
            this.f31734c = z11;
            this.f31735d = aVar;
            this.f31736e = lVar;
            this.f31737f = z12;
            this.f31738g = i11;
            this.f31739h = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f31738g | 1);
            ym0.l<Boolean, y> lVar = this.f31736e;
            boolean z5 = this.f31737f;
            m.c(this.f31732a, this.f31733b, this.f31734c, this.f31735d, lVar, z5, aVar, g11, this.f31739h);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerificationMethodComponent.kt */
    /* loaded from: classes3.dex */
    public static final class g extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f31740a = new w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ y invoke() {
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerificationMethodComponent.kt */
    /* loaded from: classes3.dex */
    public static final class h extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f31741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f31742b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31743c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f31744d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f31745e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f31746f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(boolean z5, ym0.l<? super Boolean, y> lVar, ym0.a<y> aVar, boolean z11, int i11, int i12) {
            super(2);
            this.f31741a = z5;
            this.f31742b = lVar;
            this.f31743c = aVar;
            this.f31744d = z11;
            this.f31745e = i11;
            this.f31746f = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f31745e | 1);
            ym0.a<y> aVar2 = this.f31743c;
            boolean z5 = this.f31744d;
            m.d(this.f31741a, this.f31742b, aVar2, z5, aVar, g11, this.f31746f);
            return y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r15, ym0.l<? super java.lang.Boolean, nm0.y> r16, ym0.a<nm0.y> r17, boolean r18, androidx.compose.runtime.a r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.main.components.m.a(boolean, ym0.l, ym0.a, boolean, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r15, ym0.l<? super java.lang.Boolean, nm0.y> r16, ym0.a<nm0.y> r17, boolean r18, androidx.compose.runtime.a r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.main.components.m.b(boolean, ym0.l, ym0.a, boolean, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.withings.authentication.mfa.main.components.VerificationMethodContent r22, boolean r23, boolean r24, ym0.a<nm0.y> r25, ym0.l<? super java.lang.Boolean, nm0.y> r26, boolean r27, androidx.compose.runtime.a r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.main.components.m.c(com.withings.authentication.mfa.main.components.VerificationMethodContent, boolean, boolean, ym0.a, ym0.l, boolean, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(boolean r15, ym0.l<? super java.lang.Boolean, nm0.y> r16, ym0.a<nm0.y> r17, boolean r18, androidx.compose.runtime.a r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.main.components.m.d(boolean, ym0.l, ym0.a, boolean, androidx.compose.runtime.a, int, int):void");
    }
}
