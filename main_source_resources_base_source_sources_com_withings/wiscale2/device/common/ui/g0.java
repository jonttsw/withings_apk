package com.withings.wiscale2.device.common.ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.withings.device.Device;
import com.withings.device.install.wsd.network.Wsd01WifiSetup;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import rn.c;
/* compiled from: DeviceInfoActivity.kt */
/* loaded from: classes5.dex */
public final class g0 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.lifecycle.j0 f53806a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.lifecycle.j0 f53807b;

    /* compiled from: DeviceInfoActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<fl.o, Fragment> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nn.i f53808a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(nn.i iVar) {
            super(1);
            this.f53808a = iVar;
        }

        @Override // ym0.l
        public final Fragment invoke(fl.o oVar) {
            fl.o it = oVar;
            kotlin.jvm.internal.u.j(it, "it");
            Device a11 = this.f53808a.a();
            int modelId = a11.getModelId();
            if (modelId != 1 && modelId != 2) {
                if (modelId != 58) {
                    if (modelId != 63) {
                        if (modelId != 102) {
                            if (modelId != 60) {
                                if (modelId != 61) {
                                    if (modelId != 70) {
                                        if (modelId != 71) {
                                            if (modelId != 90) {
                                                if (modelId != 91) {
                                                    switch (modelId) {
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                        case 10:
                                                            break;
                                                        default:
                                                            switch (modelId) {
                                                                case 13:
                                                                case 14:
                                                                case 15:
                                                                case 16:
                                                                case 17:
                                                                case 18:
                                                                    break;
                                                                default:
                                                                    switch (modelId) {
                                                                        case 42:
                                                                        case 43:
                                                                            com.withings.wiscale2.device.wpm.ui.l0.f55776v.getClass();
                                                                            com.withings.wiscale2.device.wpm.ui.l0 l0Var = new com.withings.wiscale2.device.wpm.ui.l0();
                                                                            l0Var.setArguments(ah.g.n(a11));
                                                                            return l0Var;
                                                                        case 44:
                                                                            bf0.b bVar = new bf0.b();
                                                                            bVar.setArguments(androidx.core.os.e.a(new nm0.j("EXTRA_DEVICE", a11)));
                                                                            return bVar;
                                                                        case 45:
                                                                            ff0.a aVar = new ff0.a();
                                                                            aVar.setArguments(androidx.core.os.e.a(new nm0.j("EXTRA_DEVICE", a11)));
                                                                            return aVar;
                                                                        case 46:
                                                                            hf0.a aVar2 = new hf0.a();
                                                                            aVar2.setArguments(androidx.core.os.e.a(new nm0.j("EXTRA_DEVICE", a11)));
                                                                            return aVar2;
                                                                        case 47:
                                                                            jf0.d dVar = new jf0.d();
                                                                            dVar.setArguments(androidx.core.os.e.a(new nm0.j("EXTRA_DEVICE", a11)));
                                                                            return dVar;
                                                                        default:
                                                                            switch (modelId) {
                                                                                case 51:
                                                                                    he0.d dVar2 = new he0.d();
                                                                                    dVar2.setArguments(ah.g.n(a11));
                                                                                    return dVar2;
                                                                                case 52:
                                                                                case 53:
                                                                                    ad0.a.f618v.getClass();
                                                                                    ad0.a aVar3 = new ad0.a();
                                                                                    aVar3.setArguments(ah.g.n(a11));
                                                                                    return aVar3;
                                                                                case 54:
                                                                                    com.withings.wiscale2.device.wam02.ui.c cVar = new com.withings.wiscale2.device.wam02.ui.c();
                                                                                    cVar.setArguments(ah.g.n(a11));
                                                                                    return cVar;
                                                                                case 55:
                                                                                    dd0.a.f63748v.getClass();
                                                                                    dd0.a aVar4 = new dd0.a();
                                                                                    aVar4.setArguments(ah.g.n(a11));
                                                                                    return aVar4;
                                                                                default:
                                                                                    switch (modelId) {
                                                                                        case 93:
                                                                                            jd0.b.B.getClass();
                                                                                            jd0.b bVar2 = new jd0.b();
                                                                                            bVar2.setArguments(ah.g.n(a11));
                                                                                            return bVar2;
                                                                                        case 94:
                                                                                            ld0.b.B.getClass();
                                                                                            ld0.b bVar3 = new ld0.b();
                                                                                            bVar3.setArguments(ah.g.n(a11));
                                                                                            return bVar3;
                                                                                        case 95:
                                                                                            nd0.b.B.getClass();
                                                                                            nd0.b bVar4 = new nd0.b();
                                                                                            bVar4.setArguments(ah.g.n(a11));
                                                                                            return bVar4;
                                                                                        default:
                                                                                            throw new IllegalStateException("You should provide a valid info fragment for modelId " + a11 + ".modelId");
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                } else {
                                                    gd0.a aVar5 = new gd0.a();
                                                    aVar5.setArguments(ah.g.n(a11));
                                                    return aVar5;
                                                }
                                            } else {
                                                com.withings.wiscale2.device.hwa06.ui.b bVar5 = new com.withings.wiscale2.device.hwa06.ui.b();
                                                bVar5.setArguments(ah.g.n(a11));
                                                return bVar5;
                                            }
                                        } else {
                                            fe0.a.f66958v.getClass();
                                            fe0.a aVar6 = new fe0.a();
                                            Bundle bundle = new Bundle();
                                            bundle.putSerializable("EXTRA_DEVICE", a11);
                                            aVar6.setArguments(bundle);
                                            return aVar6;
                                        }
                                    } else {
                                        de0.b.f63817v.getClass();
                                        de0.b bVar6 = new de0.b();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putSerializable("EXTRA_DEVICE", a11);
                                        bVar6.setArguments(bundle2);
                                        return bVar6;
                                    }
                                } else {
                                    ao.p pVar = new ao.p(0);
                                    pVar.setArguments(androidx.core.os.e.a(new nm0.j("EXTRA_DEVICE", a11)));
                                    return pVar;
                                }
                            } else {
                                c.e eVar = rn.c.f95287u;
                                u70.i macAddress = a11.getMacAddress();
                                kotlin.jvm.internal.u.i(macAddress, "getMacAddress(...)");
                                Wsd01WifiSetup wsd01WifiSetup = new Wsd01WifiSetup(macAddress);
                                eVar.getClass();
                                rn.c cVar2 = new rn.c();
                                cVar2.setArguments(androidx.core.os.e.a(new nm0.j("EXTRA_DEVICE", a11), new nm0.j("setup", wsd01WifiSetup)));
                                return cVar2;
                            }
                        } else {
                            oe0.e eVar2 = new oe0.e();
                            eVar2.setArguments(ah.g.n(a11));
                            return eVar2;
                        }
                    } else {
                        com.withings.device.details.wsm.i iVar = new com.withings.device.details.wsm.i(0);
                        iVar.setArguments(androidx.core.os.e.a(new nm0.j("EXTRA_DEVICE", a11)));
                        return iVar;
                    }
                } else {
                    ke0.a aVar7 = new ke0.a();
                    aVar7.setArguments(ah.g.n(a11));
                    return aVar7;
                }
            }
            com.withings.device.details.scale.k kVar = new com.withings.device.details.scale.k(0);
            kVar.setArguments(androidx.core.os.e.a(new nm0.j("EXTRA_DEVICE", a11)));
            return kVar;
        }
    }

    /* compiled from: DeviceInfoActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.DeviceInfoViewModel$deviceModel$1", f = "DeviceInfoActivity.kt", l = {112}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<fl.o>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f53809a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f53810b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ fl.p f53811c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ nn.i f53812d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(fl.p pVar, nn.i iVar, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f53811c = pVar;
            this.f53812d = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(this.f53811c, this.f53812d, dVar);
            bVar.f53810b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<fl.o> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((b) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f53809a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                fl.o g11 = this.f53811c.g(this.f53812d.a());
                this.f53809a = 1;
                if (((androidx.lifecycle.h0) this.f53810b).emit(g11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DeviceInfoActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<fl.o, Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nn.i f53813a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(nn.i iVar) {
            super(1);
            this.f53813a = iVar;
        }

        @Override // ym0.l
        public final Integer invoke(fl.o oVar) {
            fl.o it = oVar;
            kotlin.jvm.internal.u.j(it, "it");
            return Integer.valueOf(it.I(this.f53813a.a().getColor()));
        }
    }

    public g0(fl.p pVar, nn.i deviceInfo) {
        kotlin.jvm.internal.u.j(deviceInfo, "deviceInfo");
        androidx.lifecycle.f a11 = androidx.lifecycle.h.a(null, new b(pVar, deviceInfo, null), 3);
        this.f53806a = androidx.lifecycle.e1.b(a11, new c(deviceInfo));
        this.f53807b = androidx.lifecycle.e1.b(a11, new a(deviceInfo));
    }

    public final androidx.lifecycle.j0 f0() {
        return this.f53807b;
    }

    public final androidx.lifecycle.j0 g0() {
        return this.f53806a;
    }
}
