package com.withings.date.android;

import android.content.Context;
import androidx.camera.camera2.internal.e;
import androidx.compose.material.g6;
import com.withings.wiscale2.C1987R;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import w6.o;
/* compiled from: QuarterOfYear.kt */
/* loaded from: classes3.dex */
public final class a implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final int f36098a;

    /* renamed from: b  reason: collision with root package name */
    private final int f36099b;

    public a(int i11, int i12) {
        this.f36098a = i11;
        this.f36099b = i12;
    }

    public final int a() {
        return ((this.f36099b - 1) * 3) + 1;
    }

    public final int b() {
        return this.f36099b;
    }

    public final int c() {
        return this.f36099b * 3;
    }

    public final String d(Context context) {
        String str;
        u.j(context, "context");
        DateTime now = DateTime.now();
        String[] months = DateFormatSymbols.getInstance().getMonths();
        u.g(now);
        String str2 = "";
        if (u.e(this, new a(now.getYear(), ((now.getMonthOfYear() - 1) / 3) + 1))) {
            str = context.getString(C1987R.string.thisQuarter);
        } else {
            int i11 = this.f36099b;
            if (i11 == 1) {
                str = o.a(months[0], " - ", months[2]);
            } else if (i11 == 2) {
                str = o.a(months[3], " - ", months[5]);
            } else if (i11 == 3) {
                str = o.a(months[6], " - ", months[8]);
            } else if (i11 != 4) {
                str = "";
            } else {
                str = o.a(months[9], " - ", months[11]);
            }
        }
        int year = DateTime.now().getYear();
        int i12 = this.f36098a;
        if (i12 != year) {
            str2 = android.support.v4.media.a.a(" ", i12);
        }
        return g6.i(str, str2);
    }

    public final int e() {
        return this.f36098a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f36098a == aVar.f36098a && this.f36099b == aVar.f36099b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36099b) + (Integer.hashCode(this.f36098a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuarterOfYear(year=");
        sb2.append(this.f36098a);
        sb2.append(", index=");
        return e.c(sb2, this.f36099b, ")");
    }
}
