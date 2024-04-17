package com.withings.healthplus.contentscreens.ui.model;

import kotlin.Metadata;
/* compiled from: PlayerState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/PlayerState;", "", "Finished", "None", "Paused", "Playing", "Ready", "Released", "Lcom/withings/healthplus/contentscreens/ui/model/PlayerState$Finished;", "Lcom/withings/healthplus/contentscreens/ui/model/PlayerState$None;", "Lcom/withings/healthplus/contentscreens/ui/model/PlayerState$Paused;", "Lcom/withings/healthplus/contentscreens/ui/model/PlayerState$Playing;", "Lcom/withings/healthplus/contentscreens/ui/model/PlayerState$Ready;", "Lcom/withings/healthplus/contentscreens/ui/model/PlayerState$Released;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PlayerState {

    /* compiled from: PlayerState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/PlayerState$Finished;", "Lcom/withings/healthplus/contentscreens/ui/model/PlayerState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Finished implements PlayerState {
        public static final int $stable = 0;
        public static final Finished INSTANCE = new Finished();

        private Finished() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Finished)) {
                return false;
            }
            Finished finished = (Finished) obj;
            return true;
        }

        public int hashCode() {
            return -1343621539;
        }

        public String toString() {
            return "Finished";
        }
    }

    /* compiled from: PlayerState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/PlayerState$None;", "Lcom/withings/healthplus/contentscreens/ui/model/PlayerState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class None implements PlayerState {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof None)) {
                return false;
            }
            None none = (None) obj;
            return true;
        }

        public int hashCode() {
            return 1854575267;
        }

        public String toString() {
            return "None";
        }
    }

    /* compiled from: PlayerState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/PlayerState$Paused;", "Lcom/withings/healthplus/contentscreens/ui/model/PlayerState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Paused implements PlayerState {
        public static final int $stable = 0;
        public static final Paused INSTANCE = new Paused();

        private Paused() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Paused)) {
                return false;
            }
            Paused paused = (Paused) obj;
            return true;
        }

        public int hashCode() {
            return -120042023;
        }

        public String toString() {
            return "Paused";
        }
    }

    /* compiled from: PlayerState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/PlayerState$Playing;", "Lcom/withings/healthplus/contentscreens/ui/model/PlayerState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Playing implements PlayerState {
        public static final int $stable = 0;
        public static final Playing INSTANCE = new Playing();

        private Playing() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Playing)) {
                return false;
            }
            Playing playing = (Playing) obj;
            return true;
        }

        public int hashCode() {
            return 870297827;
        }

        public String toString() {
            return "Playing";
        }
    }

    /* compiled from: PlayerState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/PlayerState$Ready;", "Lcom/withings/healthplus/contentscreens/ui/model/PlayerState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Ready implements PlayerState {
        public static final int $stable = 0;
        public static final Ready INSTANCE = new Ready();

        private Ready() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return true;
        }

        public int hashCode() {
            return 1660642200;
        }

        public String toString() {
            return "Ready";
        }
    }

    /* compiled from: PlayerState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/PlayerState$Released;", "Lcom/withings/healthplus/contentscreens/ui/model/PlayerState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Released implements PlayerState {
        public static final int $stable = 0;
        public static final Released INSTANCE = new Released();

        private Released() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Released)) {
                return false;
            }
            Released released = (Released) obj;
            return true;
        }

        public int hashCode() {
            return -1221259480;
        }

        public String toString() {
            return "Released";
        }
    }
}
