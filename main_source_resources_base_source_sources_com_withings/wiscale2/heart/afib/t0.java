package com.withings.wiscale2.heart.afib;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.withings.library.measure.Measure;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: AFibDetailActivity.kt */
/* loaded from: classes5.dex */
public final class t0 extends androidx.fragment.app.k0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f57241a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f57242b;

    /* renamed from: c  reason: collision with root package name */
    private List<? extends Measure> f57243c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Context context, FragmentManager fragmentManager, androidx.lifecycle.k0<Integer> scrollLiveData) {
        super(fragmentManager, 1);
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(scrollLiveData, "scrollLiveData");
        this.f57241a = context;
        this.f57242b = scrollLiveData;
        this.f57243c = kotlin.collections.i0.f76187a;
    }

    public final List<Measure> a() {
        return this.f57243c;
    }

    public final void b(List<? extends Measure> value) {
        kotlin.jvm.internal.u.j(value, "value");
        this.f57243c = value;
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.e
    public final int getCount() {
        return this.f57243c.size();
    }

    @Override // androidx.fragment.app.k0
    public final Fragment getItem(int i11) {
        Measure measure;
        List<? extends Measure> list = this.f57243c;
        if (i11 >= 0 && i11 <= kotlin.collections.x.M(list)) {
            measure = list.get(i11);
        } else {
            measure = (Measure) kotlin.collections.x.T(this.f57243c);
        }
        Measure measure2 = measure;
        e.f57132n.getClass();
        kotlin.jvm.internal.u.j(measure2, "measure");
        e eVar = new e();
        eVar.setArguments(androidx.core.os.e.a(new nm0.j("measure", measure2)));
        eVar.y1(this.f57242b);
        return eVar;
    }

    @Override // androidx.viewpager.widget.e
    public final CharSequence getPageTitle(int i11) {
        Measure measure;
        List<? extends Measure> list = this.f57243c;
        if (i11 >= 0 && i11 <= kotlin.collections.x.M(list)) {
            measure = list.get(i11);
        } else {
            measure = (Measure) kotlin.collections.x.T(this.f57243c);
        }
        return b50.b.m(new DateTime(measure.getDate()), this.f57241a, true, 4);
    }
}
