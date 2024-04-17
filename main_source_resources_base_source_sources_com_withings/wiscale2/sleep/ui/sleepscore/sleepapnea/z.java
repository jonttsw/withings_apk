package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import com.withings.sleepapnea.core.BreathingDisturbanceStatus;
import com.withings.views.measure.detail.ui.views.DefinitionView;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: SleepDisorderDetailsFragment.kt */
/* loaded from: classes5.dex */
final class z extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f61499a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(s sVar) {
        super(1);
        this.f61499a = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        boolean H1;
        Object obj;
        en0.k kVar;
        en0.k kVar2;
        Integer num2 = num;
        if (num2 != null) {
            int intValue = num2.intValue();
            s sVar = this.f61499a;
            H1 = sVar.H1();
            if (H1) {
                sVar.G1().f99647e.setMessage(c50.a.b(b50.a.a(intValue)));
                s.z1(sVar).b(intValue);
            } else {
                DefinitionView definitionView = sVar.G1().f99647e;
                Iterator it = kotlin.collections.x.W(BreathingDisturbanceStatus.f44273a, BreathingDisturbanceStatus.f44274b, BreathingDisturbanceStatus.f44275c).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        BreathingDisturbanceStatus breathingDisturbanceStatus = (BreathingDisturbanceStatus) obj;
                        kotlin.jvm.internal.u.j(breathingDisturbanceStatus, "<this>");
                        int ordinal = breathingDisturbanceStatus.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        kVar2 = en0.k.f65797d;
                                        kVar = kVar2;
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    kVar = en0.r.w(0, 30);
                                }
                            } else {
                                kVar = en0.r.w(30, 60);
                            }
                        } else {
                            kVar = new en0.i(60, 100, 1);
                        }
                        if (kVar.s(intValue)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                BreathingDisturbanceStatus breathingDisturbanceStatus2 = (BreathingDisturbanceStatus) obj;
                if (breathingDisturbanceStatus2 == null) {
                    breathingDisturbanceStatus2 = BreathingDisturbanceStatus.f44276d;
                }
                definitionView.setMessage(c50.b.b(breathingDisturbanceStatus2));
                s.z1(sVar).c(intValue);
            }
        }
        return nm0.y.f85009a;
    }
}
