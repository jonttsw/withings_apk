package com.withings.wiscale2.chat.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.leaderboard.utils.LeaderboardMessageType;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: ChatItemViewHolder.kt */
/* loaded from: classes4.dex */
public final class i extends RecyclerView.z implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final String f50399a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f50400b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f50401c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f50402d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f50403e;

    /* renamed from: f  reason: collision with root package name */
    public ob0.b f50404f;

    /* compiled from: ChatItemViewHolder.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f50405a;

        static {
            int[] iArr = new int[LeaderboardMessageType.values().length];
            try {
                iArr[LeaderboardMessageType.CHEER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LeaderboardMessageType.TAUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LeaderboardMessageType.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LeaderboardMessageType.MESSAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LeaderboardMessageType.OVERTAKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LeaderboardMessageType.OVERTAKING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f50405a = iArr;
        }
    }

    /* compiled from: ChatItemViewHolder.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.a<ViewGroup> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f50406a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.f50406a = view;
        }

        @Override // ym0.a
        public final ViewGroup invoke() {
            return (ViewGroup) this.f50406a.findViewById(C1987R.id.text_container);
        }
    }

    /* compiled from: ChatItemViewHolder.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.a<TextView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f50407a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.f50407a = view;
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) this.f50407a.findViewById(C1987R.id.text_glyph);
        }
    }

    /* compiled from: ChatItemViewHolder.kt */
    /* loaded from: classes4.dex */
    static final class d extends w implements ym0.a<TextView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f50408a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.f50408a = view;
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) this.f50408a.findViewById(C1987R.id.text_message);
        }
    }

    /* compiled from: ChatItemViewHolder.kt */
    /* loaded from: classes4.dex */
    static final class e extends w implements ym0.a<TextView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f50409a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(0);
            this.f50409a = view;
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) this.f50409a.findViewById(C1987R.id.text_time);
        }
    }

    public i(View view, String str) {
        super(view);
        this.f50399a = str;
        this.f50400b = nm0.h.b(new d(view));
        nm0.g b10 = nm0.h.b(new b(view));
        this.f50401c = b10;
        this.f50402d = nm0.h.b(new c(view));
        this.f50403e = nm0.h.b(new e(view));
        ViewGroup viewGroup = (ViewGroup) b10.getValue();
        if (viewGroup != null) {
            viewGroup.setOnLongClickListener(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(ob0.b r12) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.chat.ui.i.a(ob0.b):void");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        u.j(view, "view");
        ob0.b bVar = this.f50404f;
        if (bVar != null) {
            String b10 = bVar.b();
            u.i(b10, "getMessageToKeep(...)");
            Object systemService = view.getContext().getSystemService("clipboard");
            u.h(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Message", b10));
            Toast.makeText(view.getContext(), (int) C1987R.string._COPIED_TO_CLIPBOARD_, 0).show();
            return true;
        }
        u.s("chatItem");
        throw null;
    }
}
