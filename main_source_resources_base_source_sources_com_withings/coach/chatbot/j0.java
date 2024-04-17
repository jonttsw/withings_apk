package com.withings.coach.chatbot;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.withings.wiscale2.C1987R;
import java.util.Iterator;
import java.util.List;
/* compiled from: ChatbotAdapter.kt */
/* loaded from: classes3.dex */
public final class j0 extends androidx.recyclerview.widget.u<l0, x0> {

    /* renamed from: a  reason: collision with root package name */
    private final ym0.l<Integer, nm0.y> f33011a;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(ym0.l<? super Integer, nm0.y> lVar) {
        super(new m.f());
        this.f33011a = lVar;
    }

    public static void d(j0 this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.f33011a.invoke(Integer.valueOf(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e */
    public final void onBindViewHolder(x0 holder, final int i11) {
        kotlin.jvm.internal.u.j(holder, "holder");
        if (holder instanceof d1) {
            x0.b(holder, getItem(i11), 2);
        } else {
            boolean z5 = false;
            if (holder instanceof a) {
                l0 item = getItem(i11);
                if (i11 == getItemCount() - 1) {
                    z5 = true;
                }
                holder.a(item, Boolean.valueOf(z5));
            } else if (holder instanceof o1) {
                x0.b(holder, getItem(i11), 2);
            } else if (holder instanceof b) {
                l0 item2 = getItem(i11);
                if (i11 == getItemCount() - 1) {
                    z5 = true;
                }
                holder.a(item2, Boolean.valueOf(z5));
            } else if (holder instanceof j1) {
                l0 item3 = getItem(i11);
                if (i11 == getItemCount() - 1) {
                    z5 = true;
                }
                holder.a(item3, Boolean.valueOf(z5));
            } else if (holder instanceof q1) {
                x0.b(holder, null, 3);
            }
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.withings.coach.chatbot.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j0.d(j0.this, i11);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        String f11 = getItem(i11).f();
        switch (f11.hashCode()) {
            case -698791601:
                if (f11.equals("writing_bubble")) {
                    return 5;
                }
                break;
            case -666890264:
                if (f11.equals("challenge_bubble")) {
                    return 4;
                }
                break;
            case -413566725:
                if (f11.equals("first_bubble")) {
                    return 0;
                }
                break;
            case 1077787059:
                if (f11.equals("url_preview_bubble")) {
                    return 3;
                }
                break;
            case 1669693514:
                if (f11.equals("default_bubble")) {
                    return 1;
                }
                break;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return new a(androidx.collection.c.n(parent, C1987R.layout.view_chatbot_message));
                        }
                        return new q1(androidx.collection.c.n(parent, C1987R.layout.view_chatbot_writing_message));
                    }
                    return new b(androidx.collection.c.n(parent, C1987R.layout.view_chatbot_challenge_message));
                }
                return new j1(androidx.collection.c.n(parent, C1987R.layout.view_chatbot_preview_message));
            }
            return new o1(androidx.collection.c.n(parent, C1987R.layout.view_chatbot_user_message));
        }
        return new d1(androidx.collection.c.n(parent, C1987R.layout.view_chatbot_first_message));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z zVar, int i11, List payloads) {
        Object obj;
        Object obj2;
        Object obj3;
        x0 viewHolder = (x0) zVar;
        kotlin.jvm.internal.u.j(viewHolder, "viewHolder");
        kotlin.jvm.internal.u.j(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(viewHolder, i11);
            return;
        }
        View findViewById = viewHolder.itemView.findViewById(C1987R.id.chatbot_face);
        View findViewById2 = viewHolder.itemView.findViewById(C1987R.id.loading);
        View findViewById3 = viewHolder.itemView.findViewById(C1987R.id.image_view);
        List list = payloads;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.u.e(obj2, "REMOVE_SMILEY_PAYLOAD")) {
                break;
            }
        }
        if (obj2 != null) {
            if (findViewById == null) {
                obj2 = null;
            }
            if (obj2 != null) {
                kotlin.jvm.internal.u.g(findViewById);
                findViewById.setVisibility(4);
            }
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it2.next();
            if (kotlin.jvm.internal.u.e(obj3, "UPDATE_PREVIEW_PAYLOAD")) {
                break;
            }
        }
        if (obj3 != null) {
            if (findViewById3 != null && findViewById2 != null) {
                obj = obj3;
            }
            if (obj != null) {
                kotlin.jvm.internal.u.g(findViewById2);
                kotlin.jvm.internal.u.g(findViewById3);
                int i12 = x0.f33125a;
                findViewById2.setVisibility(4);
                findViewById3.setVisibility(0);
                viewHolder.a(getItem(i11), Boolean.valueOf(i11 == getItemCount() - 1));
            }
        }
    }
}
