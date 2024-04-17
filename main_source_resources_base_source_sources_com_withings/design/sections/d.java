package com.withings.design.sections;

import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.design.sections.FastScroller;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: SectionedRecyclerViewAdapter.java */
/* loaded from: classes3.dex */
public final class d extends RecyclerView.Adapter<f> implements FastScroller.d {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<e> f36130a;

    /* compiled from: SectionedRecyclerViewAdapter.java */
    /* loaded from: classes3.dex */
    public static class a extends f {
    }

    /* compiled from: SectionedRecyclerViewAdapter.java */
    /* loaded from: classes3.dex */
    public static class b extends f {
    }

    /* compiled from: SectionedRecyclerViewAdapter.java */
    /* loaded from: classes3.dex */
    public static class c extends f {
    }

    /* compiled from: SectionedRecyclerViewAdapter.java */
    /* renamed from: com.withings.design.sections.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0477d extends f {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SectionedRecyclerViewAdapter.java */
    /* loaded from: classes3.dex */
    public static class e {
        private e() {
        }
    }

    /* compiled from: SectionedRecyclerViewAdapter.java */
    /* loaded from: classes3.dex */
    public static class f extends RecyclerView.z {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f36131a = 0;
    }

    public d() {
        new HashMap();
        new HashMap();
    }

    private void d() {
        this.f36130a = new ArrayList<>();
    }

    public final int e(int i11) {
        if (this.f36130a == null) {
            d();
        }
        getItemCount();
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.f36130a == null) {
            d();
            return 0;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        if (this.f36130a == null) {
            d();
        }
        if (i11 >= 0) {
            getItemCount();
            if (i11 < 0) {
                e(i11);
                this.f36130a.get(-1).getClass();
                return 2;
            }
            getItemCount();
            throw new IndexOutOfBoundsException("adapterPosition (" + i11 + ")  cannot be > getItemCount() (0)");
        }
        throw new IndexOutOfBoundsException(o0.a("adapterPosition (", i11, ") cannot be < 0"));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(f fVar, int i11) {
        f fVar2 = fVar;
        e(i11);
        int i12 = f.f36131a;
        fVar2.getClass();
        fVar2.itemView.setTag(C1987R.id.sectioning_adapter_tag_key_view_viewholder, fVar2);
        int itemViewType = fVar2.getItemViewType() & 255;
        fVar2.getItemViewType();
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    if (itemViewType == 3) {
                        a aVar = (a) fVar2;
                        return;
                    }
                    throw new IllegalArgumentException(o0.a("unrecognized viewType: ", itemViewType, " does not correspond to TYPE_ITEM, TYPE_HEADER, TYPE_GHOST_HEADER or TYPE_FOOTER"));
                }
                C0477d c0477d = (C0477d) fVar2;
                if (this.f36130a == null) {
                    d();
                }
                throw new IndexOutOfBoundsException("sectionIndex -1 < 0");
            }
            b bVar = (b) fVar2;
            return;
        }
        c cVar = (c) fVar2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.design.sections.d$f, androidx.recyclerview.widget.RecyclerView$z] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final f onCreateViewHolder(ViewGroup viewGroup, int i11) {
        int i12 = i11 & 255;
        if (i12 == 0) {
            return null;
        }
        if (i12 != 1) {
            if (i12 == 2 || i12 == 3) {
                return null;
            }
            throw new IndexOutOfBoundsException(o0.a("unrecognized viewType: ", i11, " does not correspond to TYPE_ITEM, TYPE_HEADER or TYPE_FOOTER"));
        }
        return new RecyclerView.z(new View(viewGroup.getContext()));
    }
}
