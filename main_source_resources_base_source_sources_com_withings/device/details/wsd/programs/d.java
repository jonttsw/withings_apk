package com.withings.device.details.wsd.programs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.camera2.internal.s2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.u;
import com.withings.alarm.model.WsdProgram;
import com.withings.alarm.model.WsdProgramElement;
import com.withings.wiscale2.C1987R;
import tn.i;
import un.l;
/* compiled from: WsdProgramAdapter.kt */
/* loaded from: classes3.dex */
public final class d extends u<WsdProgramElement, l> {

    /* renamed from: a  reason: collision with root package name */
    private final a f37173a;

    /* compiled from: WsdProgramAdapter.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void R0(h hVar, WsdProgram wsdProgram);

        void Z(l lVar, WsdProgramElement.CategoryType categoryType);

        void u2(h hVar, com.withings.alarm.model.b bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WsdProgramActivity listener) {
        super(new m.f());
        kotlin.jvm.internal.u.j(listener, "listener");
        this.f37173a = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        return getItem(i11).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z zVar, int i11) {
        l holder = (l) zVar;
        kotlin.jvm.internal.u.j(holder, "holder");
        WsdProgramElement item = getItem(i11);
        kotlin.jvm.internal.u.i(item, "getItem(...)");
        holder.a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        a aVar = this.f37173a;
        if (i11 != 0) {
            if (i11 == 1) {
                return new h(i.d(from, parent), aVar);
            }
            throw new IllegalStateException(android.support.v4.media.a.a("Unsupported viewType : ", i11));
        }
        View inflate = from.inflate(C1987R.layout.line_program_category, parent, false);
        int i12 = C1987R.id.category_name;
        TextView textView = (TextView) s2.g(inflate, C1987R.id.category_name);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            i12 = C1987R.id.overflow;
            ImageView imageView = (ImageView) s2.g(inflate, C1987R.id.overflow);
            if (imageView != null) {
                return new g(new tn.h(linearLayout, textView, linearLayout, imageView, 0), aVar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i12)));
    }
}
