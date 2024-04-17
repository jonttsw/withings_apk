package com.withings.measure.detail.paged;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k0;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: DatePagedPagerAdapter.kt */
/* loaded from: classes4.dex */
public abstract class g extends k0 {
    public static final int $stable = 8;
    private final DateTime firstDate;
    private final DateTime mostRecentDate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FragmentManager fm2, DateTime firstDate, DateTime mostRecentDate) {
        super(fm2, 0);
        u.j(fm2, "fm");
        u.j(firstDate, "firstDate");
        u.j(mostRecentDate, "mostRecentDate");
        this.firstDate = firstDate;
        this.mostRecentDate = mostRecentDate;
    }

    public abstract DateTime getDate(int i11);

    /* JADX INFO: Access modifiers changed from: protected */
    public final DateTime getFirstDate() {
        return this.firstDate;
    }

    public final DateTime getMostRecentDate() {
        return this.mostRecentDate;
    }

    public abstract int getPosition(DateTime dateTime);

    public void setCurrentScroll(int i11) {
    }
}
