package com.withings.views.measure.detail.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.camera2.internal.o0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.l;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.j;
/* compiled from: WeekColorIndicatorView.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withings/views/measure/detail/ui/views/WeekColorIndicatorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "", "colorsRes", "Lnm0/y;", "setIndicatorsColor", "(Ljava/util/List;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WeekColorIndicatorView extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    private final ArrayList f46488t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WeekColorIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        u.j(context, "context");
    }

    public final void setIndicatorsColor(List<Integer> colorsRes) {
        u.j(colorsRes, "colorsRes");
        int size = colorsRes.size();
        ArrayList arrayList = this.f46488t;
        if (size == arrayList.size()) {
            int i11 = 0;
            for (Object obj : colorsRes) {
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    int intValue = ((Number) obj).intValue();
                    Context context = getContext();
                    u.i(context, "getContext(...)");
                    ((ImageView) ((j) arrayList.get(i11)).d()).setImageDrawable(y70.a.a(C1987R.drawable.white_circle, context, intValue));
                    i11 = i12;
                } else {
                    x.K0();
                    throw null;
                }
            }
            return;
        }
        throw new IllegalArgumentException(o0.a("colorsRes must contain ", arrayList.size(), " elements !").toString());
    }

    public /* synthetic */ WeekColorIndicatorView(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekColorIndicatorView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        List<Number> W = x.W(Integer.valueOf((int) C1987R.string._MONDAY_M_), Integer.valueOf((int) C1987R.string._TUESDAY_T_), Integer.valueOf((int) C1987R.string._WEDNESDAY_W_), Integer.valueOf((int) C1987R.string._THURSDAY_T_), Integer.valueOf((int) C1987R.string._FRIDAY_F_), Integer.valueOf((int) C1987R.string._SATURDAY_S_), Integer.valueOf((int) C1987R.string._SUNDAY_S_));
        ArrayList<j> arrayList = new ArrayList(x.y(W, 10));
        for (Number number : W) {
            int intValue = number.intValue();
            TextView textView = new TextView(getContext());
            textView.setId(View.generateViewId());
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            Context context2 = textView.getContext();
            u.i(context2, "getContext(...)");
            layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, wq.a.c(4, context2), ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            textView.setLayoutParams(layoutParams);
            textView.setGravity(1);
            textView.setText(intValue);
            textView.setTextSize(10.0f);
            l.d(textView);
            textView.setTextColor(androidx.core.content.a.getColor(textView.getContext(), C1987R.color.textSecondary));
            ImageView imageView = new ImageView(getContext());
            imageView.setId(View.generateViewId());
            Context context3 = imageView.getContext();
            u.i(context3, "getContext(...)");
            int c11 = wq.a.c(12, context3);
            Context context4 = imageView.getContext();
            u.i(context4, "getContext(...)");
            imageView.setLayoutParams(new ConstraintLayout.LayoutParams(c11, wq.a.c(12, context4)));
            Context context5 = imageView.getContext();
            u.i(context5, "getContext(...)");
            Context context6 = imageView.getContext();
            u.i(context6, "getContext(...)");
            imageView.setImageDrawable(y70.a.c(C1987R.drawable.white_circle, context5, ah.u.w(C1987R.attr.colorOnSurface, context6, -65281)));
            arrayList.add(new j(textView, imageView));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            addView((TextView) jVar.a());
            addView((ImageView) jVar.b());
        }
        this.f46488t = arrayList;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.k(this);
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        for (j jVar2 : arrayList) {
            arrayList2.add(Integer.valueOf(((ImageView) jVar2.d()).getId()));
        }
        bVar.t(x.P0(arrayList2));
        for (j jVar3 : arrayList) {
            bVar.n(((TextView) jVar3.c()).getId(), 3, ((ImageView) jVar3.d()).getId(), 4);
            bVar.n(((TextView) jVar3.c()).getId(), 1, ((ImageView) jVar3.d()).getId(), 1);
            bVar.n(((TextView) jVar3.c()).getId(), 2, ((ImageView) jVar3.d()).getId(), 2);
        }
        bVar.e(this);
    }
}
