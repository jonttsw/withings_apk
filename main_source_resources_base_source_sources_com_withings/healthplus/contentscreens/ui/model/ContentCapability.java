package com.withings.healthplus.contentscreens.ui.model;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: ContentCapability.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentCapability;", "", "isAvailable", "", "(Z)V", "()Z", "Completable", "Favorite", "Swappable", "TextToSpeech", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCapability$Completable;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCapability$Favorite;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCapability$Swappable;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCapability$TextToSpeech;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ContentCapability {
    public static final int $stable = 0;
    private final boolean isAvailable;

    /* compiled from: ContentCapability.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentCapability$Completable;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCapability;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Completable extends ContentCapability {
        public static final int $stable = 0;
        public static final Completable INSTANCE = new Completable();

        private Completable() {
            super(false, 1, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Completable)) {
                return false;
            }
            Completable completable = (Completable) obj;
            return true;
        }

        public int hashCode() {
            return -762486084;
        }

        public String toString() {
            return "Completable";
        }
    }

    /* compiled from: ContentCapability.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentCapability$Favorite;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCapability;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Favorite extends ContentCapability {
        public static final int $stable = 0;
        public static final Favorite INSTANCE = new Favorite();

        private Favorite() {
            super(false, 1, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Favorite)) {
                return false;
            }
            Favorite favorite = (Favorite) obj;
            return true;
        }

        public int hashCode() {
            return 235181734;
        }

        public String toString() {
            return "Favorite";
        }
    }

    /* compiled from: ContentCapability.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentCapability$Swappable;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCapability;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Swappable extends ContentCapability {
        public static final int $stable = 0;
        public static final Swappable INSTANCE = new Swappable();

        private Swappable() {
            super(false, 1, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Swappable)) {
                return false;
            }
            Swappable swappable = (Swappable) obj;
            return true;
        }

        public int hashCode() {
            return -770464691;
        }

        public String toString() {
            return "Swappable";
        }
    }

    /* compiled from: ContentCapability.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentCapability$TextToSpeech;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCapability;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class TextToSpeech extends ContentCapability {
        public static final int $stable = 0;
        public static final TextToSpeech INSTANCE = new TextToSpeech();

        private TextToSpeech() {
            super(false, 1, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextToSpeech)) {
                return false;
            }
            TextToSpeech textToSpeech = (TextToSpeech) obj;
            return true;
        }

        public int hashCode() {
            return 496787348;
        }

        public String toString() {
            return "TextToSpeech";
        }
    }

    public /* synthetic */ ContentCapability(boolean z5, m mVar) {
        this(z5);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    private ContentCapability(boolean z5) {
        this.isAvailable = z5;
    }

    public /* synthetic */ ContentCapability(boolean z5, int i11, m mVar) {
        this((i11 & 1) != 0 ? true : z5, null);
    }
}
