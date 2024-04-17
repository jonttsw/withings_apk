package com.withings.device.details.wsd.programs.media;

import com.google.android.material.switchmaterial.SwitchMaterial;
import com.withings.alarm.ui.VolumeSeekBar;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import tn.b;
import ym0.p;
/* compiled from: WsdMediaActivity.kt */
@e(c = "com.withings.device.details.wsd.programs.media.WsdMediaActivity$updateMediaFragment$1", f = "WsdMediaActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WsdMediaActivity f37204a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WsdMediaActivity wsdMediaActivity, d<? super a> dVar) {
        super(2, dVar);
        this.f37204a = wsdMediaActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new a(this.f37204a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        boolean z5;
        boolean z11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        WsdMediaActivity wsdMediaActivity = this.f37204a;
        wsdMediaActivity.y4();
        if (wsdMediaActivity.F3() != null) {
            b bVar = wsdMediaActivity.f37185j;
            if (bVar != null) {
                VolumeSeekBar volume = bVar.f100297q;
                u.i(volume, "volume");
                wsdMediaActivity.u4(volume);
                bool = wsdMediaActivity.f37194s;
                if (bool == null) {
                    z5 = wsdMediaActivity.f37192q;
                    b bVar2 = wsdMediaActivity.f37185j;
                    if (bVar2 != null) {
                        if (z5 != bVar2.f100286f.isChecked()) {
                            wsdMediaActivity.f37193r = true;
                            b bVar3 = wsdMediaActivity.f37185j;
                            if (bVar3 != null) {
                                SwitchMaterial switchMaterial = bVar3.f100286f;
                                z11 = wsdMediaActivity.f37192q;
                                switchMaterial.setChecked(z11);
                            } else {
                                u.s("binding");
                                throw null;
                            }
                        }
                    } else {
                        u.s("binding");
                        throw null;
                    }
                }
            } else {
                u.s("binding");
                throw null;
            }
        }
        return y.f85009a;
    }
}
