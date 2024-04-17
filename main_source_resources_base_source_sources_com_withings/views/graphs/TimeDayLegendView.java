package com.withings.views.graphs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: TimeDayLegendView.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/views/graphs/TimeDayLegendView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ld80/c;", "t", "Ld80/c;", "getBinding", "()Ld80/c;", "binding", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TimeDayLegendView extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    private final d80.c f46457t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeDayLegendView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public final d80.c getBinding() {
        return this.f46457t;
    }

    @SuppressLint({"SetTextI18n"})
    public final void t(DateTime dateTime, DateTime dateTime2) {
        d80.c cVar = this.f46457t;
        if (dateTime != null && dateTime2 != null) {
            long millis = dateTime2.getMillis() - dateTime.getMillis();
            int i11 = (int) (millis * 0.2d);
            DateTime plusMillis = dateTime.plusMillis(i11);
            DateTime plusMillis2 = dateTime.plusMillis(((int) millis) / 2);
            DateTime minusMillis = dateTime2.minusMillis(i11);
            TextView textView = cVar.f63586c;
            u.g(plusMillis);
            Context context = getContext();
            u.i(context, "getContext(...)");
            textView.setText(b50.b.f(plusMillis, context, "ha", "HH:mm"));
            u.g(plusMillis2);
            Context context2 = getContext();
            u.i(context2, "getContext(...)");
            cVar.f63585b.setText(b50.b.f(plusMillis2, context2, "ha", "HH:mm"));
            u.g(minusMillis);
            Context context3 = getContext();
            u.i(context3, "getContext(...)");
            cVar.f63584a.setText(b50.b.f(minusMillis, context3, "ha", "HH:mm"));
            return;
        }
        DateTime withTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
        TextView textView2 = cVar.f63586c;
        DateTime plusHours = withTimeAtStartOfDay.plusHours(6);
        u.i(plusHours, "plusHours(...)");
        Context context4 = getContext();
        u.i(context4, "getContext(...)");
        textView2.setText(b50.b.f(plusHours, context4, "ha", "HH:mm"));
        DateTime plusHours2 = withTimeAtStartOfDay.plusHours(12);
        u.i(plusHours2, "plusHours(...)");
        Context context5 = getContext();
        u.i(context5, "getContext(...)");
        cVar.f63585b.setText(b50.b.f(plusHours2, context5, "ha", "HH:mm"));
        DateTime plusHours3 = withTimeAtStartOfDay.plusHours(18);
        u.i(plusHours3, "plusHours(...)");
        Context context6 = getContext();
        u.i(context6, "getContext(...)");
        cVar.f63584a.setText(b50.b.f(plusHours3, context6, "ha", "HH:mm"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeDayLegendView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f46457t = d80.c.a(LayoutInflater.from(context), this);
        t(null, null);
    }
}
