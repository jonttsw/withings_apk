package com.withings.common.compose.component;
/* compiled from: AdaptableRow.kt */
/* loaded from: classes3.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdaptableRow.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<androidx.compose.ui.layout.s, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k3.d f33412a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<k3.h> f33413b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k3.d dVar, k1.r0<k3.h> r0Var) {
            super(1);
            this.f33412a = dVar;
            this.f33413b = r0Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(androidx.compose.ui.layout.s sVar) {
            androidx.compose.ui.layout.s it = sVar;
            kotlin.jvm.internal.u.j(it, "it");
            k1.r0<k3.h> r0Var = this.f33413b;
            float e11 = r0Var.getValue().e();
            k3.d dVar = this.f33412a;
            if (Float.compare(e11, dVar.u((int) (it.a() & 4294967295L))) < 0) {
                r0Var.setValue(k3.h.a(dVar.u((int) (it.a() & 4294967295L))));
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdaptableRow.kt */
    /* renamed from: com.withings.common.compose.component.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0450b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f33414a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f33415b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<k1, nm0.y> f33416c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f33417d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f33418e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0450b(androidx.compose.ui.e eVar, float f11, ym0.l<? super k1, nm0.y> lVar, int i11, int i12) {
            super(2);
            this.f33414a = eVar;
            this.f33415b = f11;
            this.f33416c = lVar;
            this.f33417d = i11;
            this.f33418e = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33417d | 1);
            float f11 = this.f33415b;
            ym0.l<k1, nm0.y> lVar = this.f33416c;
            b.a(this.f33414a, f11, lVar, aVar, g11, this.f33418e);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.e r17, float r18, ym0.l<? super com.withings.common.compose.component.k1, nm0.y> r19, androidx.compose.runtime.a r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.b.a(androidx.compose.ui.e, float, ym0.l, androidx.compose.runtime.a, int, int):void");
    }
}
