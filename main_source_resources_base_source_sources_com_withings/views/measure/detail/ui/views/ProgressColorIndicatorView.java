package com.withings.views.measure.detail.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.l;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import en0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.j;
/* compiled from: ProgressColorIndicatorView.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/views/measure/detail/ui/views/ProgressColorIndicatorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ProgressColorIndicatorView extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    private List<? extends j<? extends TextView, ? extends ImageView>> f46484t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressColorIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        u.j(context, "context");
    }

    public final void t(int i11, int i12) {
        boolean z5;
        int i13;
        i iVar = new i(1, i12, 1);
        ArrayList arrayList = new ArrayList(x.y(iVar, 10));
        en0.j it = iVar.iterator();
        while (it.hasNext()) {
            int a11 = it.a();
            String valueOf = String.valueOf(a11);
            TextView textView = new TextView(getContext());
            textView.setId(View.generateViewId());
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            Context context = textView.getContext();
            u.i(context, "getContext(...)");
            layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, wq.a.c(4, context), ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            textView.setLayoutParams(layoutParams);
            textView.setGravity(1);
            textView.setText(valueOf);
            textView.setTextSize(10.0f);
            l.d(textView);
            textView.setTextColor(androidx.core.content.a.getColor(textView.getContext(), C1987R.color.color_text_quaternary));
            if (a11 <= i11) {
                z5 = true;
            } else {
                z5 = false;
            }
            ImageView imageView = new ImageView(getContext());
            imageView.setId(View.generateViewId());
            Context context2 = imageView.getContext();
            u.i(context2, "getContext(...)");
            int c11 = wq.a.c(12, context2);
            Context context3 = imageView.getContext();
            u.i(context3, "getContext(...)");
            imageView.setLayoutParams(new ConstraintLayout.LayoutParams(c11, wq.a.c(12, context3)));
            Context context4 = imageView.getContext();
            u.i(context4, "getContext(...)");
            if (z5) {
                i13 = C1987R.color.statusInfo;
            } else {
                i13 = C1987R.color.statusUndefined;
            }
            imageView.setImageDrawable(y70.a.a(C1987R.drawable.white_circle, context4, i13));
            arrayList.add(new j(textView, imageView));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            j jVar = (j) it2.next();
            addView((TextView) jVar.a());
            addView((ImageView) jVar.b());
        }
        this.f46484t = arrayList;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.k(this);
        List<? extends j<? extends TextView, ? extends ImageView>> list = this.f46484t;
        ArrayList arrayList2 = new ArrayList(x.y(list, 10));
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((ImageView) ((j) it3.next()).d()).getId()));
        }
        bVar.t(x.P0(arrayList2));
        Iterator<T> it4 = this.f46484t.iterator();
        while (it4.hasNext()) {
            j jVar2 = (j) it4.next();
            bVar.n(((TextView) jVar2.c()).getId(), 3, ((ImageView) jVar2.d()).getId(), 4);
            bVar.n(((TextView) jVar2.c()).getId(), 1, ((ImageView) jVar2.d()).getId(), 1);
            bVar.n(((TextView) jVar2.c()).getId(), 2, ((ImageView) jVar2.d()).getId(), 2);
        }
        bVar.e(this);
    }

    public /* synthetic */ ProgressColorIndicatorView(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressColorIndicatorView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f46484t = i0.f76187a;
    }
}
