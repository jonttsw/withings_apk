package com.withings.wiscale2.device.wpm.event;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class EventWpm02Upgrade$State {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ EventWpm02Upgrade$State[] f55610a = {new Enum("UPGRADE_AVAILABLE", 0), new Enum("UPGRADE_AVAILABLE_AND_NEEDED", 1), new Enum("ALREADY_UP_TO_DATE_OR_FAILED", 2), new Enum("UPGRADING", 3), new Enum("UPGRADE_AND_REBOOT_SUCCESS", 4), new Enum("UPGRADE_FAILED", 5)};
    /* JADX INFO: Fake field, exist only in values array */
    EventWpm02Upgrade$State EF5;

    private EventWpm02Upgrade$State() {
        throw null;
    }

    public static EventWpm02Upgrade$State valueOf(String str) {
        return (EventWpm02Upgrade$State) Enum.valueOf(EventWpm02Upgrade$State.class, str);
    }

    public static EventWpm02Upgrade$State[] values() {
        return (EventWpm02Upgrade$State[]) f55610a.clone();
    }
}
