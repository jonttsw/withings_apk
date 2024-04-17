package com.withings.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import ym0.p;
import zq.b;
/* compiled from: Sheet.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/bottomsheet/RadioRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bottomsheet_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RadioRecyclerView extends RecyclerView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadioRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gi.d, androidx.recyclerview.widget.m$f] */
    public final void E0(p pVar, List list) {
        a aVar = new a(list, new m.f(), pVar);
        aVar.submitList(list);
        setAdapter(aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioRecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        b.a(this, C1987R.drawable.sheet_list_divider, 1);
    }
}
