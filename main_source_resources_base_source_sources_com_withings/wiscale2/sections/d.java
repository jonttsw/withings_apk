package com.withings.wiscale2.sections;

import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.h;
import androidx.appcompat.widget.l0;
import androidx.camera.camera2.internal.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sections.FastScroller;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: SectionedRecyclerViewAdapter.java */
@Deprecated
/* loaded from: classes5.dex */
public class d extends RecyclerView.Adapter<g> implements FastScroller.d {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<e> f59614a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<Integer, Boolean> f59615b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private HashMap<Integer, f> f59616c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private int[] f59617d;

    /* renamed from: e  reason: collision with root package name */
    private int f59618e;

    /* compiled from: SectionedRecyclerViewAdapter.java */
    /* loaded from: classes5.dex */
    public static class a extends g {
    }

    /* compiled from: SectionedRecyclerViewAdapter.java */
    /* loaded from: classes5.dex */
    public static class b extends g {
    }

    /* compiled from: SectionedRecyclerViewAdapter.java */
    /* loaded from: classes5.dex */
    public static class c extends g {
    }

    /* compiled from: SectionedRecyclerViewAdapter.java */
    /* renamed from: com.withings.wiscale2.sections.d$d  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0768d extends g {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f59619b = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SectionedRecyclerViewAdapter.java */
    /* loaded from: classes5.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        int f59620a;

        /* renamed from: b  reason: collision with root package name */
        int f59621b;

        /* renamed from: c  reason: collision with root package name */
        boolean f59622c;

        /* renamed from: d  reason: collision with root package name */
        boolean f59623d;

        /* synthetic */ e(int i11) {
            this();
        }

        private e() {
        }
    }

    /* compiled from: SectionedRecyclerViewAdapter.java */
    /* loaded from: classes5.dex */
    private static class f {

        /* renamed from: a  reason: collision with root package name */
        SparseBooleanArray f59624a;

        /* synthetic */ f(int i11) {
            this();
        }

        private f() {
            this.f59624a = new SparseBooleanArray();
        }
    }

    /* compiled from: SectionedRecyclerViewAdapter.java */
    /* loaded from: classes5.dex */
    public static class g extends RecyclerView.z {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f59625a = 0;
    }

    private void d() {
        int i11;
        this.f59614a = new ArrayList<>();
        int i12 = i();
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            e eVar = new e(0);
            eVar.f59620a = i13;
            eVar.f59622c = e(i14);
            eVar.f59623d = this instanceof com.withings.wiscale2.heart.bloodpressure.a;
            HashMap<Integer, Boolean> hashMap = this.f59615b;
            if (hashMap.containsKey(Integer.valueOf(i14)) && hashMap.get(Integer.valueOf(i14)).booleanValue()) {
                eVar.f59621b = 0;
                h(i14);
            } else {
                eVar.f59621b = h(i14);
            }
            if (eVar.f59622c) {
                eVar.f59621b += 2;
            }
            if (eVar.f59623d) {
                eVar.f59621b++;
            }
            this.f59614a.add(eVar);
            i13 += eVar.f59621b;
        }
        this.f59618e = i13;
        this.f59617d = new int[i13];
        int i15 = i();
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            e eVar2 = this.f59614a.get(i17);
            int i18 = 0;
            while (true) {
                i11 = eVar2.f59621b;
                if (i18 < i11) {
                    this.f59617d[i16 + i18] = i17;
                    i18++;
                }
            }
            i16 += i11;
        }
    }

    public boolean e(int i11) {
        return false;
    }

    public final int f(int i11) {
        if (e(i11)) {
            if (this.f59614a == null) {
                d();
            }
            if (i11 >= 0) {
                if (i11 < this.f59614a.size()) {
                    return this.f59614a.get(i11).f59620a;
                }
                StringBuilder b10 = l0.b("sectionIndex ", i11, " >= sections.size (");
                b10.append(this.f59614a.size());
                b10.append(")");
                throw new IndexOutOfBoundsException(b10.toString());
            }
            throw new IndexOutOfBoundsException(o0.a("sectionIndex ", i11, " < 0"));
        }
        return -1;
    }

    public final int g(int i11) {
        return getItemViewType(i11) & 255;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.f59614a == null) {
            d();
        }
        return this.f59618e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r8 == (r0.f59621b - 1)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
        if (r8 == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
        if (r8 == (r0.f59621b - 1)) goto L14;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemViewType(int r8) {
        /*
            r7 = this;
            java.util.ArrayList<com.withings.wiscale2.sections.d$e> r0 = r7.f59614a
            if (r0 != 0) goto L7
            r7.d()
        L7:
            java.lang.String r0 = "adapterPosition ("
            if (r8 < 0) goto L6c
            int r1 = r7.getItemCount()
            if (r8 >= r1) goto L50
            int r0 = r7.k(r8)
            java.util.ArrayList<com.withings.wiscale2.sections.d$e> r1 = r7.f59614a
            java.lang.Object r0 = r1.get(r0)
            com.withings.wiscale2.sections.d$e r0 = (com.withings.wiscale2.sections.d.e) r0
            int r1 = r0.f59620a
            int r8 = r8 - r1
            boolean r1 = r0.f59622c
            r2 = 3
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L3c
            boolean r6 = r0.f59623d
            if (r6 == 0) goto L3c
            if (r8 != 0) goto L30
        L2e:
            r2 = r3
            goto L4d
        L30:
            if (r8 != r5) goto L34
        L32:
            r2 = r5
            goto L4d
        L34:
            int r0 = r0.f59621b
            int r0 = r0 - r5
            if (r8 != r0) goto L3a
            goto L4d
        L3a:
            r2 = r4
            goto L4d
        L3c:
            if (r1 == 0) goto L44
            if (r8 != 0) goto L41
            goto L2e
        L41:
            if (r8 != r5) goto L3a
            goto L32
        L44:
            boolean r1 = r0.f59623d
            if (r1 == 0) goto L3a
            int r0 = r0.f59621b
            int r0 = r0 - r5
            if (r8 != r0) goto L3a
        L4d:
            r8 = r2 & 255(0xff, float:3.57E-43)
            return r8
        L50:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = ")  cannot be > getItemCount() ("
            java.lang.StringBuilder r8 = androidx.appcompat.widget.l0.b(r0, r8, r2)
            int r0 = r7.getItemCount()
            r8.append(r0)
            java.lang.String r0 = ")"
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r1.<init>(r8)
            throw r1
        L6c:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = ") cannot be < 0"
            java.lang.String r8 = androidx.camera.camera2.internal.o0.a(r0, r8, r2)
            r1.<init>(r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sections.d.getItemViewType(int):int");
    }

    public int h(int i11) {
        return 0;
    }

    public int i() {
        return 0;
    }

    public final int j(int i11, int i12) {
        if (this.f59614a == null) {
            d();
        }
        if (i11 >= 0) {
            if (i11 < this.f59614a.size()) {
                e eVar = this.f59614a.get(i11);
                int i13 = i12 - eVar.f59620a;
                if (i13 <= eVar.f59621b) {
                    if (eVar.f59622c) {
                        return i13 - 2;
                    }
                    return i13;
                }
                StringBuilder e11 = h.e("adapterPosition: ", i12, " is beyond sectionIndex: ", i11, " length: ");
                e11.append(eVar.f59621b);
                throw new IndexOutOfBoundsException(e11.toString());
            }
            StringBuilder b10 = l0.b("sectionIndex ", i11, " >= sections.size (");
            b10.append(this.f59614a.size());
            b10.append(")");
            throw new IndexOutOfBoundsException(b10.toString());
        }
        throw new IndexOutOfBoundsException(o0.a("sectionIndex ", i11, " < 0"));
    }

    public final int k(int i11) {
        if (this.f59614a == null) {
            d();
        }
        if (getItemCount() == 0) {
            return -1;
        }
        if (i11 >= 0 && i11 < getItemCount()) {
            return this.f59617d[i11];
        }
        throw new IndexOutOfBoundsException(o0.a("adapterPosition ", i11, " is not in range of items represented by adapter"));
    }

    public final void l(int i11, int i12) {
        int i13;
        ArrayList<e> arrayList = this.f59614a;
        HashMap<Integer, f> hashMap = this.f59616c;
        if (arrayList == null) {
            d();
            d();
            notifyDataSetChanged();
            this.f59615b.clear();
            hashMap.clear();
        } else {
            d();
            e eVar = this.f59614a.get(i11);
            if (eVar.f59622c) {
                i13 = i12 + 2;
            } else {
                i13 = i12;
            }
            notifyItemRemoved(eVar.f59620a + i13);
        }
        f fVar = hashMap.get(Integer.valueOf(i11));
        if (fVar == null) {
            fVar = new f(0);
            hashMap.put(Integer.valueOf(i11), fVar);
        }
        SparseBooleanArray sparseBooleanArray = fVar.f59624a;
        SparseBooleanArray clone = sparseBooleanArray.clone();
        sparseBooleanArray.clear();
        int size = clone.size();
        for (int i14 = 0; i14 < size; i14++) {
            int keyAt = clone.keyAt(i14);
            if (keyAt < i12 || keyAt >= i12 + 1) {
                int i15 = keyAt >= i12 ? keyAt - 1 : keyAt;
                if (clone.get(keyAt)) {
                    sparseBooleanArray.put(i15, true);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(g gVar, int i11) {
        g gVar2 = gVar;
        int k11 = k(i11);
        int i12 = g.f59625a;
        gVar2.getClass();
        h(k11);
        gVar2.itemView.setTag(C1987R.id.sectioning_adapter_tag_key_view_viewholder, gVar2);
        int itemViewType = gVar2.getItemViewType() & 255;
        gVar2.getItemViewType();
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    if (itemViewType == 3) {
                        m((a) gVar2, k11);
                        return;
                    }
                    throw new IllegalArgumentException(o0.a("unrecognized viewType: ", itemViewType, " does not correspond to TYPE_ITEM, TYPE_HEADER, TYPE_GHOST_HEADER or TYPE_FOOTER"));
                }
                int j5 = j(k11, i11);
                int i13 = C0768d.f59619b;
                o((C0768d) gVar2, k11, j5);
                return;
            }
            b bVar = (b) gVar2;
            return;
        }
        n((c) gVar2, k11);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.withings.wiscale2.sections.d$g, androidx.recyclerview.widget.RecyclerView$z] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final g onCreateViewHolder(ViewGroup viewGroup, int i11) {
        int i12 = i11 & 255;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        return p(viewGroup);
                    }
                    throw new IndexOutOfBoundsException(o0.a("unrecognized viewType: ", i11, " does not correspond to TYPE_ITEM, TYPE_HEADER or TYPE_FOOTER"));
                }
                return r(viewGroup);
            }
            return new RecyclerView.z(new View(viewGroup.getContext()));
        }
        return q(viewGroup);
    }

    public a p(ViewGroup viewGroup) {
        return null;
    }

    public c q(ViewGroup viewGroup) {
        return null;
    }

    public C0768d r(ViewGroup viewGroup) {
        return null;
    }

    public void m(a aVar, int i11) {
    }

    public void n(c cVar, int i11) {
    }

    public void o(C0768d c0768d, int i11, int i12) {
    }
}
