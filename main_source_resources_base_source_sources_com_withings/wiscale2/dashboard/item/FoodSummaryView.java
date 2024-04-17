package com.withings.wiscale2.dashboard.item;

import android.content.Context;
import android.util.AttributeSet;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.webradio.ui.b;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.dashboard.item.model.BaseSummaryItemView;
import com.withings.wiscale2.dashboard.item.model.c;
import dq.a;
import jm.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import qb0.d;
/* compiled from: FoodSummaryItem.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/wiscale2/dashboard/item/FoodSummaryView;", "Lcom/withings/wiscale2/dashboard/item/model/BaseSummaryItemView;", "Lqb0/d;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FoodSummaryView extends BaseSummaryItemView<d> {
    public static final /* synthetic */ int P = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FoodSummaryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        u.j(context, "context");
    }

    @Override // com.withings.wiscale2.dashboard.item.model.BaseSummaryItemView
    public final void C(c cVar) {
        D(cVar);
    }

    @Override // com.withings.wiscale2.dashboard.item.model.BaseSummaryItemView
    public final void D(c cVar) {
        v();
        setOnClickListener(new a(this, 2));
    }

    @Override // com.withings.wiscale2.dashboard.item.model.BaseSummaryItemView
    public final void z(User user, d dVar) {
        int i11;
        d dVar2 = dVar;
        u.j(user, "user");
        int b10 = dVar2.b() - dVar2.a();
        Context context = getContext();
        u.i(context, "getContext(...)");
        setValue(jm.a.c(a.d.a(context), 87, b10, 0, 0, 60));
        float a11 = dVar2.a();
        float b11 = dVar2.b();
        Context context2 = getContext();
        if (dVar2.a() >= dVar2.b()) {
            i11 = C1987R.color.statusGood;
        } else {
            i11 = C1987R.color.statusInfo;
        }
        y(androidx.core.content.a.getColor(context2, i11), a11, b11);
        A(DateTime.now().getMillis(), false);
        setOnClickListener(new b(1, this, user));
    }

    public /* synthetic */ FoodSummaryView(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodSummaryView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, C1987R.id.dashboard_nutrition_remaining_calories);
        u.j(context, "context");
    }
}
