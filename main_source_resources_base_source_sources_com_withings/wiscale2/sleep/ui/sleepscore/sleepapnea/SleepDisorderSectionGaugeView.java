package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Context;
import android.util.AttributeSet;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.views.view.HorizontalScaleView;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* compiled from: SleepDisorderSectionGaugeView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004R*\u0010\b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/sleepapnea/SleepDisorderSectionGaugeView;", "Lcom/withings/views/view/HorizontalScaleView;", "Lcom/withings/views/view/HorizontalScaleView$f;", "getFirstScalePart", "()Lcom/withings/views/view/HorizontalScaleView$f;", "getSecondScalePart", "getThirdScalePart", "", "value", "u0", "D", "getValue", "()D", "setValue", "(D)V", "", "v0", "Z", "isBreathingDisorder", "()Z", "setBreathingDisorder", "(Z)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepDisorderSectionGaugeView extends HorizontalScaleView {

    /* renamed from: w0  reason: collision with root package name */
    public static final /* synthetic */ int f61271w0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    private double f61272u0;

    /* renamed from: v0  reason: collision with root package name */
    private boolean f61273v0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SleepDisorderSectionGaugeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.u.j(context, "context");
    }

    private final HorizontalScaleView.f getFirstScalePart() {
        int i11;
        if (this.f61273v0) {
            i11 = 30;
        } else {
            i11 = 15;
        }
        return new HorizontalScaleView.f("", i11, androidx.core.content.a.getColor(getContext(), C1987R.color.statusGood));
    }

    private final HorizontalScaleView.f getSecondScalePart() {
        int i11;
        boolean z5 = this.f61273v0;
        int i12 = 30;
        if (z5) {
            i11 = 30;
        } else {
            i11 = 15;
        }
        if (z5) {
            i12 = 60;
        }
        return new HorizontalScaleView.f("", i12 - i11, androidx.core.content.a.getColor(getContext(), C1987R.color.statusModerate));
    }

    private final HorizontalScaleView.f getThirdScalePart() {
        int i11;
        int i12;
        boolean z5 = this.f61273v0;
        if (z5) {
            i11 = 60;
        } else {
            i11 = 30;
        }
        if (z5) {
            i12 = 100;
        } else {
            i12 = 150;
        }
        Context context = getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        return new HorizontalScaleView.f("", i12 - i11, ah.u.w(C1987R.attr.colorError, context, -65281));
    }

    public final double getValue() {
        return this.f61272u0;
    }

    public final void setBreathingDisorder(boolean z5) {
        this.f61273v0 = z5;
    }

    public final void setValue(double d11) {
        this.f61272u0 = d11;
        setScale(new HorizontalScaleView.e(0, kotlin.collections.x.W(getFirstScalePart(), getSecondScalePart(), getThirdScalePart())));
        setDelegate(new m6.u(10));
        n();
        double d12 = this.f61272u0;
        if (d12 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            d12 = 0.0d;
        }
        setCursorValue((int) d12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepDisorderSectionGaugeView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.u.j(context, "context");
    }
}
