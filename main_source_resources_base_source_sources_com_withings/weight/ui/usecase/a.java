package com.withings.weight.ui.usecase;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.weight.android.model.BodyComposition;
import com.withings.weight.android.model.BodyCompositionBundle;
import com.withings.weight.ui.usecase.BodyCompositionDescriptionInformation;
import javax.inject.Inject;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: BuildBodyCompositionDescriptionBundleUseCase.kt */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final jm.a f47827a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuildBodyCompositionDescriptionBundleUseCase.kt */
    /* renamed from: com.withings.weight.ui.usecase.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0659a extends w implements l<Double, String> {
        C0659a() {
            super(1);
        }

        @Override // ym0.l
        public final String invoke(Double d11) {
            return jm.a.c(a.this.f47827a, ConstantsWs.MEASURE_TYPE_MUSCLE_MASS_SEGMENT, d11.doubleValue(), 0, 0, 60).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuildBodyCompositionDescriptionBundleUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements l<Double, String> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final String invoke(Double d11) {
            return jm.a.d(a.this.f47827a, d11.doubleValue()).toString();
        }
    }

    @Inject
    public a(jm.a aVar) {
        this.f47827a = aVar;
    }

    private final BodyCompositionDescriptionInformation c(BodyCompositionDescriptionInformation.Limb limb, BodyComposition.BodyCompositionType bodyCompositionType, double d11, com.withings.weight.ui.segmentalBodyCompositionScreen.model.a aVar) {
        l bVar;
        if (bodyCompositionType == BodyComposition.BodyCompositionType.MUSCLE) {
            bVar = new C0659a();
        } else {
            bVar = new b();
        }
        if ((FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE <= d11 && d11 <= aVar.d().a().c()) || aVar.d().a().a(d11)) {
            return new BodyCompositionDescriptionInformation.d(limb, bodyCompositionType, aVar.d().c(), (String) bVar.invoke(Double.valueOf(aVar.d().a().b())));
        }
        if (aVar.c().a().a(d11)) {
            return new BodyCompositionDescriptionInformation.c(limb, bodyCompositionType, aVar.c().c(), (String) bVar.invoke(Double.valueOf(aVar.c().a().c())), (String) bVar.invoke(Double.valueOf(aVar.c().a().b())));
        }
        if (aVar.e().a().a(d11)) {
            return new BodyCompositionDescriptionInformation.e(limb, bodyCompositionType, aVar.e().c(), (String) bVar.invoke(Double.valueOf(aVar.e().a().c())), (String) bVar.invoke(Double.valueOf(aVar.e().a().b())));
        }
        if (aVar.a().a().a(d11)) {
            return new BodyCompositionDescriptionInformation.a(limb, bodyCompositionType, aVar.a().c(), (String) bVar.invoke(Double.valueOf(aVar.a().a().c())), (String) bVar.invoke(Double.valueOf(aVar.a().a().b())));
        }
        if (aVar.b().a().a(d11) || (aVar.b().a().b() <= d11 && d11 <= Double.MAX_VALUE)) {
            return new BodyCompositionDescriptionInformation.b(limb, bodyCompositionType, aVar.b().c(), (String) bVar.invoke(Double.valueOf(aVar.b().a().c())));
        }
        throw new IllegalStateException("Body composition value is outside ranges boundaries.");
    }

    public final v90.b b(BodyCompositionBundle bodyCompositionBundle, r90.b segmentalPopulationRepartitionBundle) {
        u.j(segmentalPopulationRepartitionBundle, "segmentalPopulationRepartitionBundle");
        BodyCompositionDescriptionInformation.Limb limb = BodyCompositionDescriptionInformation.Limb.f47800a;
        BodyComposition.BodyCompositionType bodyCompositionType = BodyComposition.BodyCompositionType.FAT;
        BodyCompositionDescriptionInformation c11 = c(limb, bodyCompositionType, bodyCompositionBundle.getFat().getTorso().getInBodyCompPercentage(), segmentalPopulationRepartitionBundle.a().g());
        BodyCompositionDescriptionInformation.Limb limb2 = BodyCompositionDescriptionInformation.Limb.f47801b;
        BodyCompositionDescriptionInformation c12 = c(limb2, bodyCompositionType, bodyCompositionBundle.getFat().getArms().getInBodyCompPercentage(), segmentalPopulationRepartitionBundle.a().a());
        BodyCompositionDescriptionInformation.Limb limb3 = BodyCompositionDescriptionInformation.Limb.f47802c;
        v90.a aVar = new v90.a(c11, c12, c(limb3, bodyCompositionType, bodyCompositionBundle.getFat().getLegs().getInBodyCompPercentage(), segmentalPopulationRepartitionBundle.a().d()));
        BodyComposition.BodyCompositionType bodyCompositionType2 = BodyComposition.BodyCompositionType.MUSCLE;
        return new v90.b(aVar, new v90.a(c(limb, bodyCompositionType2, bodyCompositionBundle.getMuscle().getTorso().getInKilogram(), segmentalPopulationRepartitionBundle.b().g()), c(limb2, bodyCompositionType2, bodyCompositionBundle.getMuscle().getArms().getInKilogram(), segmentalPopulationRepartitionBundle.b().a()), c(limb3, bodyCompositionType2, bodyCompositionBundle.getMuscle().getLegs().getInKilogram(), segmentalPopulationRepartitionBundle.b().d())));
    }
}
