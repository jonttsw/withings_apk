package com.withings.wiscale2.sleep.ui.sleepscore;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.withings.user.core.models.User;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.s;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: SleepDisorderDayPagerFragment.kt */
/* loaded from: classes5.dex */
public final class e2 extends androidx.fragment.app.k0 {

    /* renamed from: a  reason: collision with root package name */
    private final User f60919a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f60920b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f60921c;

    /* renamed from: d  reason: collision with root package name */
    private List<a> f60922d;

    /* compiled from: SleepDisorderDayPagerFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f60923a;

        /* renamed from: b  reason: collision with root package name */
        private final DateTime f60924b;

        /* renamed from: c  reason: collision with root package name */
        private final String f60925c;

        public a(long j5, DateTime dateTime, String title) {
            kotlin.jvm.internal.u.j(title, "title");
            this.f60923a = j5;
            this.f60924b = dateTime;
            this.f60925c = title;
        }

        public final String a() {
            return this.f60925c;
        }

        public final long b() {
            return this.f60923a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f60923a == aVar.f60923a && kotlin.jvm.internal.u.e(this.f60924b, aVar.f60924b) && kotlin.jvm.internal.u.e(this.f60925c, aVar.f60925c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f60925c.hashCode() + com.google.android.gms.internal.mlkit_common.a.b(this.f60924b, Long.hashCode(this.f60923a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SleepApneaInfo(trackId=");
            sb2.append(this.f60923a);
            sb2.append(", date=");
            sb2.append(this.f60924b);
            sb2.append(", title=");
            return androidx.camera.core.y1.e(sb2, this.f60925c, ")");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(FragmentManager fragmentManager, User user, boolean z5, androidx.lifecycle.k0<Integer> scrollLiveData) {
        super(fragmentManager, 1);
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(scrollLiveData, "scrollLiveData");
        this.f60919a = user;
        this.f60920b = z5;
        this.f60921c = scrollLiveData;
        this.f60922d = kotlin.collections.i0.f76187a;
    }

    public final void a(ArrayList arrayList) {
        this.f60922d = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.e
    public final int getCount() {
        return this.f60922d.size();
    }

    @Override // androidx.fragment.app.k0
    public final Fragment getItem(int i11) {
        a aVar;
        List<a> list = this.f60922d;
        if (i11 >= 0 && i11 <= kotlin.collections.x.M(list)) {
            aVar = list.get(i11);
        } else {
            aVar = (a) kotlin.collections.x.T(this.f60922d);
        }
        s.a aVar2 = com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.s.f61445q;
        long b10 = aVar.b();
        aVar2.getClass();
        User user = this.f60919a;
        kotlin.jvm.internal.u.j(user, "user");
        com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.s sVar = new com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.s();
        sVar.setArguments(androidx.core.os.e.a(new nm0.j("arg_track_id", Long.valueOf(b10)), new nm0.j("arg_user", user), new nm0.j("arg_is_sleep_apnea", Boolean.valueOf(this.f60920b))));
        sVar.I1(this.f60921c);
        return sVar;
    }

    @Override // androidx.viewpager.widget.e
    public final int getItemPosition(Object object) {
        kotlin.jvm.internal.u.j(object, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.e
    public final CharSequence getPageTitle(int i11) {
        a aVar;
        List<a> list = this.f60922d;
        if (i11 >= 0 && i11 <= kotlin.collections.x.M(list)) {
            aVar = list.get(i11);
        } else {
            aVar = (a) kotlin.collections.x.T(this.f60922d);
        }
        return aVar.a();
    }
}
