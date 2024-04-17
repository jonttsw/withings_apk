package com.withings.wiscale2.bodytemperature.data;

import com.withings.fever.core.model.FeverLevel;
import com.withings.views.measure.detail.ui.views.DefinitionView;
import com.withings.wiscale2.C1987R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import org.joda.time.DateTime;
import ym0.p;
/* compiled from: BodyTemperatureMeasureDetailScreen.kt */
/* loaded from: classes4.dex */
final class b extends w implements p<Double, DateTime, DefinitionView> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BodyTemperatureMeasureDetailScreen f50299a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DefinitionView f50300b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BodyTemperatureMeasureDetailScreen bodyTemperatureMeasureDetailScreen, DefinitionView definitionView) {
        super(2);
        this.f50299a = bodyTemperatureMeasureDetailScreen;
        this.f50300b = definitionView;
    }

    @Override // ym0.p
    public final DefinitionView invoke(Double d11, DateTime dateTime) {
        int i11;
        double doubleValue = d11.doubleValue();
        DateTime date = dateTime;
        u.j(date, "date");
        BodyTemperatureMeasureDetailScreen bodyTemperatureMeasureDetailScreen = this.f50299a;
        yr.a aVar = bodyTemperatureMeasureDetailScreen.f50293b;
        DateTime f11 = bodyTemperatureMeasureDetailScreen.f50292a.f();
        u.i(f11, "getBirthDate(...)");
        DateTime dateTime2 = new DateTime(date);
        aVar.getClass();
        FeverLevel b10 = yr.a.a(f11, dateTime2).b(doubleValue);
        DefinitionView definitionView = this.f50300b;
        definitionView.setVisibility(0);
        int ordinal = b10.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        i11 = C1987R.string.sleepApnea_ahiStatusError;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i11 = C1987R.string.temperature_detail_highFever_description;
                }
            } else {
                i11 = C1987R.string.temperature_detail_mildFever_description;
            }
        } else {
            i11 = C1987R.string.temperature_detail_noFever_description;
        }
        definitionView.setMessage(i11);
        definitionView.setButtonClickListener(new a(definitionView));
        return definitionView;
    }
}
