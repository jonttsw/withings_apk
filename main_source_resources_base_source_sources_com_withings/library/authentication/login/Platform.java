package com.withings.library.authentication.login;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: Server.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/login/Platform;", "", "()V", "MedicalUs", "Wellness", "Lcom/withings/library/authentication/login/Platform$MedicalUs;", "Lcom/withings/library/authentication/login/Platform$Wellness;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Platform {

    /* compiled from: Server.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/Platform$MedicalUs;", "Lcom/withings/library/authentication/login/Platform;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MedicalUs extends Platform {
        public static final MedicalUs INSTANCE = new MedicalUs();

        private MedicalUs() {
            super(null);
        }
    }

    /* compiled from: Server.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/login/Platform$Wellness;", "Lcom/withings/library/authentication/login/Platform;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Wellness extends Platform {
        public static final Wellness INSTANCE = new Wellness();

        private Wellness() {
            super(null);
        }
    }

    public /* synthetic */ Platform(m mVar) {
        this();
    }

    private Platform() {
    }
}
