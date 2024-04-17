package com.withings.wiscale2.heart.heartrate;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import org.joda.time.DateTime;
/* compiled from: HeartRateDayActivity.kt */
/* loaded from: classes5.dex */
public final class v extends qy.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f57726a;

    /* renamed from: b  reason: collision with root package name */
    private final User f57727b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, FragmentManager fragmentManager, User user, DateTime dateTime) {
        super(fragmentManager, dateTime, DateTime.now());
        kotlin.jvm.internal.u.j(user, "user");
        this.f57726a = context;
        this.f57727b = user;
    }

    @Override // qy.a
    public final Fragment getFragment(DateTime day) {
        kotlin.jvm.internal.u.j(day, "day");
        w.f57729s.getClass();
        User user = this.f57727b;
        kotlin.jvm.internal.u.j(user, "user");
        w wVar = new w();
        wVar.setArguments(androidx.core.os.e.a(new nm0.j(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user), new nm0.j(FoodDayFragment.ARG_DAY, day)));
        return wVar;
    }

    @Override // androidx.viewpager.widget.e
    public final CharSequence getPageTitle(int i11) {
        DateTime date = getDate(i11);
        kotlin.jvm.internal.u.i(date, "getDate(...)");
        return b50.b.i(this.f57726a, date);
    }
}
