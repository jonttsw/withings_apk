package com.withings.wiscale2.chat.ui;

import com.withings.leaderboard.repositories.data.LeaderboardEntry;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.chat.ui.ChatActivity", f = "ChatActivity.kt", l = {125, 126}, m = "loadData")
/* loaded from: classes4.dex */
public final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    ChatActivity f50373a;

    /* renamed from: b  reason: collision with root package name */
    LeaderboardEntry f50374b;

    /* renamed from: c  reason: collision with root package name */
    int f50375c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f50376d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ChatActivity f50377e;

    /* renamed from: f  reason: collision with root package name */
    int f50378f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ChatActivity chatActivity, qm0.d<? super a> dVar) {
        super(dVar);
        this.f50377e = chatActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f50376d = obj;
        this.f50378f |= Integer.MIN_VALUE;
        return ChatActivity.B3(this.f50377e, this);
    }
}
