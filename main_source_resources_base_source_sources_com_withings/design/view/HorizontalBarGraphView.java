package com.withings.design.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.compose.material.o;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: HorizontalBarGraphView.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/withings/design/view/HorizontalBarGraphView;", "Landroid/widget/LinearLayout;", "", "Lcom/withings/design/view/HorizontalBarGraphView$a;", "bars", "Lnm0/y;", "setBars", "(Ljava/util/List;)V", "", "a", "Ljava/util/List;", "getBars", "()Ljava/util/List;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "library_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HorizontalBarGraphView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f36241a;

    /* compiled from: HorizontalBarGraphView.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    ((a) obj).getClass();
                    if (!u.e(null, null) || !u.e(null, null) || !u.e(null, null) || Float.compare(0.0f, 0.0f) != 0 || !u.e(null, null)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return o.a(0.0f, Integer.hashCode(0) * 923521, 31);
        }

        public final String toString() {
            return "Bar(color=0, label=null, primaryValue=null, secondaryValue=null, fraction=0.0, hatchColor=null)";
        }
    }

    public HorizontalBarGraphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final List<a> getBars() {
        return this.f36241a;
    }

    public final void setBars(List<a> bars) {
        u.k(bars, "bars");
        ArrayList arrayList = this.f36241a;
        arrayList.clear();
        arrayList.addAll(bars);
        removeAllViews();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).getClass();
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Context context = getContext();
            u.f(context, "context");
            HorizontalBarView horizontalBarView = new HorizontalBarView(context, null, 6, 0);
            horizontalBarView.setBar((a) it2.next());
            horizontalBarView.setLayoutParams(new LinearLayout.LayoutParams(-1, ah.g.i(46, getContext())));
            addView(horizontalBarView);
        }
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalBarGraphView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.k(context, "context");
        this.f36241a = new ArrayList();
    }
}
