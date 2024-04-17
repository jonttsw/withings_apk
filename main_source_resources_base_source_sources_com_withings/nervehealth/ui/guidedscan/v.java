package com.withings.nervehealth.ui.guidedscan;

import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.e1;
import androidx.compose.material.g6;
import androidx.compose.material.h6;
import androidx.compose.material3.g9;
import androidx.compose.material3.i1;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.common.compose.component.ToastStyle;
import com.withings.common.compose.component.v4;
import com.withings.common.compose.component.x4;
import com.withings.common.compose.component.z4;
import com.withings.common.device.model.capabilities.DeviceWithVideoMedia;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.nervehealth.ui.guidedscan.d;
import com.withings.wiscale2.C1987R;
import k1.j1;
import k1.v0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.http2.Http2;
/* compiled from: NerveHealthGuidedScanScreen.kt */
/* loaded from: classes4.dex */
public final class v {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NerveHealthGuidedScanScreen.kt */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f42659a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar) {
            super(2);
            this.f42659a = pVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                this.f42659a.invoke(aVar2, 0);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NerveHealthGuidedScanScreen.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f42660a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(2);
            this.f42660a = str;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                r0.d0.a(e1.n(androidx.compose.ui.e.f8927a, yk.h.B()), aVar2);
                v4.b(null, this.f42660a, null, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NerveHealthGuidedScanScreen.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f42661a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar) {
            super(2);
            this.f42661a = pVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                this.f42661a.invoke(aVar2, 0);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NerveHealthGuidedScanScreen.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f42662a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar) {
            super(2);
            this.f42662a = pVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar = this.f42662a;
                if (pVar != null) {
                    pVar.invoke(aVar2, 0);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NerveHealthGuidedScanScreen.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f42663a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar) {
            super(3);
            this.f42663a = pVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h GuidedPresentation = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(GuidedPresentation, "$this$GuidedPresentation");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                this.f42663a.invoke(aVar2, 0);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NerveHealthGuidedScanScreen.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f42664a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h2.d f42665b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f42666c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f42667d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f42668e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f42669f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f42670g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f42671h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f42672i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(String str, h2.d dVar, ym0.a<nm0.y> aVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar2, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar3, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar4, int i11, int i12) {
            super(2);
            this.f42664a = str;
            this.f42665b = dVar;
            this.f42666c = aVar;
            this.f42667d = pVar;
            this.f42668e = pVar2;
            this.f42669f = pVar3;
            this.f42670g = pVar4;
            this.f42671h = i11;
            this.f42672i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f42671h | 1);
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar = this.f42669f;
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar2 = this.f42670g;
            v.a(this.f42664a, this.f42665b, this.f42666c, this.f42667d, this.f42668e, pVar, pVar2, aVar, g11, this.f42672i);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NerveHealthGuidedScanScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanScreenKt$NerveHealthGuidedScanScreen$1", f = "NerveHealthGuidedScanScreen.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0 f42673a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CoroutineScope f42674b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z4 f42675c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f42676d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f42677e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NerveHealthGuidedScanScreen.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanScreenKt$NerveHealthGuidedScanScreen$1$1", f = "NerveHealthGuidedScanScreen.kt", l = {82}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f42678a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p0 f42679b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z4 f42680c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f42681d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ long f42682e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, z4 z4Var, String str, long j5, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f42679b = p0Var;
                this.f42680c = z4Var;
                this.f42681d = str;
                this.f42682e = j5;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f42679b, this.f42680c, this.f42681d, this.f42682e, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f42678a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    String c11 = this.f42679b.c();
                    if (c11 != null) {
                        ToastStyle toastStyle = ToastStyle.f33352e;
                        this.f42678a = 1;
                        if (z4.c(this.f42680c, toastStyle, c11, this.f42681d, this.f42682e, null, this, 16) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p0 p0Var, CoroutineScope coroutineScope, z4 z4Var, String str, long j5, qm0.d<? super g> dVar) {
            super(2, dVar);
            this.f42673a = p0Var;
            this.f42674b = coroutineScope;
            this.f42675c = z4Var;
            this.f42676d = str;
            this.f42677e = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new g(this.f42673a, this.f42674b, this.f42675c, this.f42676d, this.f42677e, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            p0 p0Var = this.f42673a;
            if ((p0Var.b() instanceof d.b) && ((d.b) p0Var.b()).d()) {
                BuildersKt__Builders_commonKt.launch$default(this.f42674b, null, null, new a(this.f42673a, this.f42675c, this.f42676d, this.f42677e, null), 3, null);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NerveHealthGuidedScanScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanScreenKt$NerveHealthGuidedScanScreen$2$1", f = "NerveHealthGuidedScanScreen.kt", l = {88}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f42683a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u0.i0 f42684b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p0 f42685c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(u0.i0 i0Var, p0 p0Var, qm0.d<? super h> dVar) {
            super(2, dVar);
            this.f42684b = i0Var;
            this.f42685c = p0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new h(this.f42684b, this.f42685c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((h) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object m11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f42683a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                int a11 = this.f42685c.b().a();
                this.f42683a = 1;
                m11 = this.f42684b.m(a11, 0.0f, m0.k.c(0.0f, 0.0f, null, 7), this);
                if (m11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NerveHealthGuidedScanScreen.kt */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.r<u0.d0, Integer, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f42686a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f42687b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p0 f42688c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z4 f42689d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f42690e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f42691f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f42692g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f42693h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, p0 p0Var, z4 z4Var, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, ym0.a<nm0.y> aVar5, ym0.a<nm0.y> aVar6) {
            super(4);
            this.f42686a = aVar;
            this.f42687b = aVar2;
            this.f42688c = p0Var;
            this.f42689d = z4Var;
            this.f42690e = aVar3;
            this.f42691f = aVar4;
            this.f42692g = aVar5;
            this.f42693h = aVar6;
        }

        @Override // ym0.r
        public final nm0.y invoke(u0.d0 d0Var, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            d.b bVar;
            DeviceWithVideoMedia.a aVar2;
            u0.d0 HorizontalPager = d0Var;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar3 = aVar;
            num2.intValue();
            kotlin.jvm.internal.u.j(HorizontalPager, "$this$HorizontalPager");
            int a11 = d.c.f42602b.a();
            ym0.a<nm0.y> aVar4 = this.f42686a;
            boolean z5 = false;
            if (intValue == a11) {
                aVar3.s(2136881848);
                v.e(aVar4, this.f42687b, aVar3, 0);
                aVar3.J();
            } else {
                p0 p0Var = this.f42688c;
                if (intValue == 1) {
                    aVar3.s(2136882010);
                    if ((p0Var.b() instanceof d.b) && ((d.b) p0Var.b()).d()) {
                        z5 = true;
                    }
                    com.withings.nervehealth.ui.guidedscan.d b10 = p0Var.b();
                    if (b10 instanceof d.b) {
                        bVar = (d.b) b10;
                    } else {
                        bVar = null;
                    }
                    if (bVar == null || (aVar2 = bVar.b()) == null) {
                        aVar2 = new DeviceWithVideoMedia.a(C1987R.string.deviceInstallation_ariane_wbs12_vascularAge_video_b_url, 2131232420);
                    }
                    v.d(z5, this.f42689d, aVar2, this.f42686a, this.f42690e, this.f42691f, this.f42692g, this.f42693h, aVar3, 512);
                    aVar3.J();
                } else if (intValue == d.a.f42599b.a()) {
                    aVar3.s(2136882806);
                    v.c(p0Var.d(), aVar4, aVar3, 0);
                    aVar3.J();
                } else {
                    aVar3.s(2136882942);
                    aVar3.J();
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NerveHealthGuidedScanScreen.kt */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0 f42694a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f42695b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f42696c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f42697d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f42698e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f42699f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f42700g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f42701h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(p0 p0Var, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.a<nm0.y> aVar4, ym0.a<nm0.y> aVar5, ym0.a<nm0.y> aVar6, int i11) {
            super(2);
            this.f42694a = p0Var;
            this.f42695b = aVar;
            this.f42696c = aVar2;
            this.f42697d = aVar3;
            this.f42698e = aVar4;
            this.f42699f = aVar5;
            this.f42700g = aVar6;
            this.f42701h = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f42701h | 1);
            ym0.a<nm0.y> aVar2 = this.f42699f;
            ym0.a<nm0.y> aVar3 = this.f42700g;
            v.b(this.f42694a, this.f42695b, this.f42696c, this.f42697d, this.f42698e, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NerveHealthGuidedScanScreen.kt */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f42702a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final /* bridge */ /* synthetic */ Integer invoke() {
            return 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r26, h2.d r27, ym0.a<nm0.y> r28, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r29, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r30, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r31, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r32, androidx.compose.runtime.a r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.nervehealth.ui.guidedscan.v.a(java.lang.String, h2.d, ym0.a, ym0.p, ym0.p, ym0.p, ym0.p, androidx.compose.runtime.a, int, int):void");
    }

    public static final void b(p0 state, ym0.a<nm0.y> onBack, ym0.a<nm0.y> onFinishIntro, ym0.a<nm0.y> onLaunchScan, ym0.a<nm0.y> onLaunchLater, ym0.a<nm0.y> onFinishScan, ym0.a<nm0.y> onFinishLater, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        boolean z5;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        kotlin.jvm.internal.u.j(state, "state");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onFinishIntro, "onFinishIntro");
        kotlin.jvm.internal.u.j(onLaunchScan, "onLaunchScan");
        kotlin.jvm.internal.u.j(onLaunchLater, "onLaunchLater");
        kotlin.jvm.internal.u.j(onFinishScan, "onFinishScan");
        kotlin.jvm.internal.u.j(onFinishLater, "onFinishLater");
        androidx.compose.runtime.b g11 = aVar.g(760119608);
        if ((i11 & 14) == 0) {
            if (g11.K(state)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onBack)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onFinishIntro)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i11 & 7168) == 0) {
            if (g11.w(onLaunchScan)) {
                i16 = ModuleCopy.f28574b;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        if ((57344 & i11) == 0) {
            if (g11.w(onLaunchLater)) {
                i15 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i15;
        }
        if ((458752 & i11) == 0) {
            if (g11.w(onFinishScan)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        if ((3670016 & i11) == 0) {
            if (g11.w(onFinishLater)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
        }
        int i21 = i12;
        if ((i21 & 2995931) == 599186 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            u0.k0 e11 = u0.n0.e(state.b().a(), k.f42702a, g11, 0);
            Object c11 = androidx.compose.material.o.c(g11, 773894976, -492369756);
            if (c11 == a.C0060a.a()) {
                c11 = androidx.datastore.preferences.protobuf.e.b(k1.y.i(g11), g11);
            }
            g11.J();
            CoroutineScope a11 = ((androidx.compose.runtime.k) c11).a();
            g11.J();
            z4 b10 = x4.b(g11);
            k1.y.f(state.c(), new g(state, a11, b10, ay.b.u(C1987R.string.nerveHealth_guidedScan_activity_toast_title, g11), 1000L, null), g11);
            com.withings.nervehealth.ui.guidedscan.d b11 = state.b();
            g11.s(1955593453);
            boolean K = g11.K(e11);
            if ((i21 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = K | z5;
            Object t11 = g11.t();
            if (z11 || t11 == a.C0060a.a()) {
                t11 = new h(e11, state, null);
                g11.n(t11);
            }
            g11.J();
            k1.y.f(b11, (ym0.p) t11, g11);
            g11.s(733328855);
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.layout.l0 d11 = g6.d(false, g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c12 = androidx.compose.ui.layout.y.c(aVar2);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                ym0.p b12 = com.withings.authentication.e.b(g11, d11, g11, l5);
                if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b12);
                }
                c12.invoke(j1.a(g11), g11, 0);
                g11.s(2058660585);
                bVar = g11;
                u0.o.a(e11, null, null, null, 0, 0.0f, null, null, false, false, null, null, s1.b.b(bVar, 374704641, new i(onBack, onFinishIntro, state, b10, onLaunchScan, onLaunchLater, onFinishScan, onFinishLater)), bVar, 100663296, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 3838);
                g9.a(bVar);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new j(state, onBack, onFinishIntro, onLaunchScan, onLaunchLater, onFinishScan, onFinishLater, i11));
        }
    }

    public static final void c(String str, ym0.a aVar, androidx.compose.runtime.a aVar2, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar2.g(680242819);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.K(str)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            a(ay.b.v(C1987R.string.nerveHealth_guidedScan_tuto3_title, new Object[]{str}, g11), d1.e.a(), aVar, com.withings.nervehealth.ui.guidedscan.b.f42579e, s1.b.b(g11, -1526462893, new w(aVar)), null, com.withings.nervehealth.ui.guidedscan.b.f42580f, g11, ((i12 << 6) & ConstantsWs.HWFAILURE_ZERO) | 1600512, 32);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new x(str, aVar, i11));
        }
    }

    public static final void d(boolean z5, z4 z4Var, DeviceWithVideoMedia.a aVar, ym0.a aVar2, ym0.a aVar3, ym0.a aVar4, ym0.a aVar5, ym0.a aVar6, androidx.compose.runtime.a aVar7, int i11) {
        androidx.compose.runtime.b g11 = aVar7.g(-188559054);
        g11.s(733328855);
        e.a aVar8 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.layout.l0 d11 = g6.d(false, g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar8);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            ym0.p b10 = com.withings.authentication.e.b(g11, d11, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            c11.invoke(j1.a(g11), g11, 0);
            g11.s(2058660585);
            long O = ((i1) g11.D(androidx.compose.material3.j1.e())).O();
            int i12 = androidx.compose.foundation.layout.e.f4229i;
            e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.B());
            wk.c0.b(null, z4Var, null, aVar2, s1.b.b(g11, -1551254101, new y(aVar)), com.withings.nervehealth.ui.guidedscan.b.f42577c, s1.b.b(g11, 613778733, new z(aVar5, aVar3, z5)), s1.b.b(g11, -451188498, new a0(aVar6, aVar4, z5)), O, false, new r0.x(yk.h.o(), yk.h.B(), yk.h.o(), yk.h.s()), o11, 0.0f, true, com.withings.nervehealth.ui.guidedscan.b.f42578d, g11, (i11 & 112) | 14376960 | (i11 & 7168), 27648, 4613);
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new b0(z5, z4Var, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, i11));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void e(ym0.a aVar, ym0.a aVar2, androidx.compose.runtime.a aVar3, int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar3.g(-573264384);
        if ((i11 & 14) == 0) {
            if (g11.w(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(aVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            a(ay.b.u(C1987R.string.nerveHealth_guidedScan_tuto1_title, g11), d1.e.a(), aVar, com.withings.nervehealth.ui.guidedscan.b.f42575a, s1.b.b(g11, 867999184, new c0(aVar2)), null, com.withings.nervehealth.ui.guidedscan.b.f42576b, g11, ((i12 << 6) & ConstantsWs.HWFAILURE_ZERO) | 1600512, 32);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d0(aVar, aVar2, i11));
        }
    }
}
