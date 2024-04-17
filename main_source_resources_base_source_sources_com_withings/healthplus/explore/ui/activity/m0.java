package com.withings.healthplus.explore.ui.activity;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.healthplus.explore.ui.activity.ExploreTabActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class m0 extends kotlin.jvm.internal.w implements ym0.a<ExploreTabActivity.a.AbstractC0526a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity.f f40329a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ExploreTabActivity.f fVar) {
        super(0);
        this.f40329a = fVar;
    }

    @Override // ym0.a
    public final ExploreTabActivity.a.AbstractC0526a invoke() {
        ExploreTabActivity.f fVar = this.f40329a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(ExploreTabActivity.a.AbstractC0526a.class);
        Activity activity = fVar.f40286b;
        if (isAssignableFrom) {
            return (ExploreTabActivity.a.AbstractC0526a) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "startDestination");
        }
        if (Serializable.class.isAssignableFrom(ExploreTabActivity.a.AbstractC0526a.class)) {
            return (ExploreTabActivity.a.AbstractC0526a) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "startDestination");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra startDestination of class ", q0.b(ExploreTabActivity.a.AbstractC0526a.class), " is not supported"));
    }
}
