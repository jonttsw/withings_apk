package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.views.measure.detail.ui.views.DefinitionView;
import com.withings.views.view.SectionView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderSectionGaugeView;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import kotlin.Metadata;
/* compiled from: SleepDisorderSectionView.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepDisorderSectionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/util/AttributeSet;", "t", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "attrs", "Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepDisorderSectionView$a;", "u", "Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepDisorderSectionView$a;", "getListener", "()Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepDisorderSectionView$a;", "setListener", "(Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepDisorderSectionView$a;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepDisorderSectionView extends ConstraintLayout {
    private final Group A;
    private final SectionView B;

    /* renamed from: t  reason: collision with root package name */
    private final AttributeSet f60622t;

    /* renamed from: u  reason: collision with root package name */
    private a f60623u;

    /* renamed from: v  reason: collision with root package name */
    private LineCellView f60624v;

    /* renamed from: w  reason: collision with root package name */
    private TextView f60625w;

    /* renamed from: x  reason: collision with root package name */
    private final DefinitionView f60626x;

    /* renamed from: y  reason: collision with root package name */
    private final SleepDisorderSectionGaugeView f60627y;

    /* renamed from: z  reason: collision with root package name */
    private final Group f60628z;

    /* compiled from: SleepDisorderSectionView.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void o1(Track track);

        void y0(Track track);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SleepDisorderSectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.u.j(context, "context");
    }

    public final AttributeSet getAttrs() {
        return this.f60622t;
    }

    public final a getListener() {
        return this.f60623u;
    }

    public final void setListener(a aVar) {
        this.f60623u = aVar;
    }

    public final void t(di0.a sleepData, k0 k0Var) {
        boolean z5;
        String h11;
        String h12;
        int i11;
        kotlin.jvm.internal.u.j(sleepData, "sleepData");
        if (k0Var != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        DefinitionView definitionView = this.f60626x;
        definitionView.setButtonVisible(z5);
        this.f60623u = k0Var;
        Track d11 = sleepData.d();
        if (d11 != null) {
            Parcelable data = d11.getData();
            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
            SleepTrackData sleepTrackData = (SleepTrackData) data;
            boolean z11 = fl.p.f67672b.a().k(d11.getDeviceModel()) instanceof gl.h;
            TextView textView = this.f60625w;
            LineCellView lineCellView = this.f60624v;
            Group group = this.f60628z;
            SleepDisorderSectionGaugeView sleepDisorderSectionGaugeView = this.f60627y;
            Group group2 = this.A;
            SectionView sectionView = this.B;
            if (z11 && TrackKt.hasSleepApnea(d11)) {
                Integer apneaHypopneaIndex = sleepTrackData.getApneaHypopneaIndex();
                kotlin.jvm.internal.u.i(apneaHypopneaIndex, "getApneaHypopneaIndex(...)");
                int intValue = apneaHypopneaIndex.intValue();
                sectionView.setTitle(getContext().getString(C1987R.string.sleepApnea_title));
                if (intValue >= 0) {
                    setVisibility(0);
                    group2.setVisibility(0);
                    int ordinal = b50.a.a(intValue).ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                i11 = C1987R.string.sleepApnea_ahiDescriptionError;
                            } else {
                                i11 = C1987R.string.sleepApnea_ahiDescriptionLow;
                            }
                        } else {
                            i11 = C1987R.string.sleepApnea_ahiDescriptionMedium;
                        }
                    } else {
                        i11 = C1987R.string.sleepApnea_ahiDescriptionHigh;
                    }
                    definitionView.setMessage(i11);
                    definitionView.setButtonText(com.withings.wiscale2.spo2.m.h(definitionView, C1987R.string.sleepApnea_ahiButton));
                    definitionView.setButtonClickListener(new g2(this, d11));
                    lineCellView.setValue(com.withings.wiscale2.spo2.m.h(lineCellView, c50.a.d(b50.a.a(intValue))));
                    lineCellView.setLabel(com.withings.wiscale2.spo2.m.h(lineCellView, C1987R.string.sleepApnea_ahiTitle));
                    Context context = sleepDisorderSectionGaugeView.getContext();
                    kotlin.jvm.internal.u.i(context, "getContext(...)");
                    sleepDisorderSectionGaugeView.setCursorColor(ah.u.w(C1987R.attr.colorOnSurface, context, -65281));
                    sleepDisorderSectionGaugeView.setBreathingDisorder(false);
                    sleepDisorderSectionGaugeView.setValue(intValue);
                    return;
                }
                group2.setVisibility(8);
                definitionView.setButtonVisible(false);
                if (intValue != -2) {
                    if (intValue != -1) {
                        setVisibility(8);
                        return;
                    }
                    textView.setText(com.withings.wiscale2.spo2.m.h(this, C1987R.string.sleepApnea_ahiNightTooShort_title));
                    definitionView.setMessage(C1987R.string.sleepApnea_ahiNightTooShort_description);
                    setVisibility(0);
                    group.setVisibility(0);
                    return;
                }
                textView.setText(com.withings.wiscale2.spo2.m.h(this, C1987R.string.sleepApnea_ahiMicroMute_title));
                definitionView.setMessage(C1987R.string.sleepApnea_ahiMicroMute_description);
                setVisibility(0);
                group.setVisibility(0);
            } else if (z11 && TrackKt.hasBreathingDisturbance(d11)) {
                Integer breathingEventProbability = sleepTrackData.getBreathingEventProbability();
                kotlin.jvm.internal.u.i(breathingEventProbability, "getBreathingEventProbability(...)");
                int intValue2 = breathingEventProbability.intValue();
                sectionView.setTitle(getContext().getString(C1987R.string.sleepApnea_breathingDisorderTitle));
                if (intValue2 != -1 && intValue2 != -2) {
                    setVisibility(0);
                    group2.setVisibility(0);
                    if (intValue2 >= 0 && intValue2 < 30) {
                        h11 = com.withings.wiscale2.spo2.m.h(this, C1987R.string.sleepApnea_breathingDisorderDescriptionLow);
                    } else if (30 <= intValue2 && intValue2 < 60) {
                        h11 = com.withings.wiscale2.spo2.m.h(this, C1987R.string.sleepApnea_breathingDisorderDescriptionMedium);
                    } else if (60 <= intValue2 && intValue2 < 101) {
                        h11 = com.withings.wiscale2.spo2.m.h(this, C1987R.string.sleepApnea_breathingDisorderDescriptionHigh);
                    } else {
                        h11 = com.withings.wiscale2.spo2.m.h(this, C1987R.string.sleepApnea_breathingDisorderDescriptionError);
                    }
                    definitionView.setMessage(h11);
                    definitionView.setButtonText(com.withings.wiscale2.spo2.m.h(definitionView, C1987R.string.sleepApnea_breathingDisorderButton));
                    definitionView.setButtonClickListener(new f2(this, d11));
                    if (intValue2 >= 0 && intValue2 < 30) {
                        h12 = com.withings.wiscale2.spo2.m.h(this, C1987R.string.sleepApnea_breathingDisorderStatusLow);
                    } else if (30 <= intValue2 && intValue2 < 60) {
                        h12 = com.withings.wiscale2.spo2.m.h(this, C1987R.string.sleepApnea_breathingDisorderStatusMedium);
                    } else if (60 <= intValue2 && intValue2 < 101) {
                        h12 = com.withings.wiscale2.spo2.m.h(this, C1987R.string.sleepApnea_breathingDisorderStatusHigh);
                    } else {
                        h12 = com.withings.wiscale2.spo2.m.h(this, C1987R.string.sleepApnea_breathingDisorderStatusError);
                    }
                    lineCellView.setValue(h12);
                    lineCellView.setLabel(com.withings.wiscale2.spo2.m.h(lineCellView, C1987R.string.sleepApnea_breathingDisorderTitle));
                    Context context2 = sleepDisorderSectionGaugeView.getContext();
                    kotlin.jvm.internal.u.i(context2, "getContext(...)");
                    sleepDisorderSectionGaugeView.setCursorColor(ah.u.w(C1987R.attr.colorOnSurface, context2, -65281));
                    sleepDisorderSectionGaugeView.setBreathingDisorder(true);
                    sleepDisorderSectionGaugeView.setValue(intValue2);
                    return;
                }
                group2.setVisibility(8);
                definitionView.setButtonVisible(false);
                if (intValue2 != -2) {
                    if (intValue2 != -1) {
                        setVisibility(8);
                        return;
                    }
                    textView.setText(com.withings.wiscale2.spo2.m.h(this, C1987R.string.sleepApnea_nightTooShort_title));
                    definitionView.setMessage(C1987R.string.sleepApnea_nightTooShort_description);
                    setVisibility(0);
                    group.setVisibility(0);
                    return;
                }
                textView.setText(com.withings.wiscale2.spo2.m.h(this, C1987R.string.sleepApnea_MicroMute_title));
                definitionView.setMessage(C1987R.string.sleepApnea_MicroMute_description);
                setVisibility(0);
                group.setVisibility(0);
            } else {
                setVisibility(8);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepDisorderSectionView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.u.j(context, "context");
        this.f60622t = attributeSet;
        View inflate = LayoutInflater.from(getContext()).inflate(C1987R.layout.view_sleep_disorder_section, this);
        View findViewById = inflate.findViewById(C1987R.id.title_linecellview);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f60624v = (LineCellView) findViewById;
        View findViewById2 = inflate.findViewById(C1987R.id.error_image);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(C1987R.id.error_title);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f60625w = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(C1987R.id.sleep_disorder_description);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f60626x = (DefinitionView) findViewById4;
        View findViewById5 = inflate.findViewById(C1987R.id.sleep_disorder_gauge);
        kotlin.jvm.internal.u.i(findViewById5, "findViewById(...)");
        this.f60627y = (SleepDisorderSectionGaugeView) findViewById5;
        View findViewById6 = inflate.findViewById(C1987R.id.error_group);
        kotlin.jvm.internal.u.i(findViewById6, "findViewById(...)");
        this.f60628z = (Group) findViewById6;
        View findViewById7 = inflate.findViewById(C1987R.id.not_error_group);
        kotlin.jvm.internal.u.i(findViewById7, "findViewById(...)");
        this.A = (Group) findViewById7;
        View findViewById8 = inflate.findViewById(C1987R.id.section);
        kotlin.jvm.internal.u.i(findViewById8, "findViewById(...)");
        this.B = (SectionView) findViewById8;
    }
}
