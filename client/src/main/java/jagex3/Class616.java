package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class616 {

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "Lclient!vk;")
	public static final Class616 aClass616_1 = new Class616(0);

	@OriginalMember(owner = "client!vk", name = "n", descriptor = "Lclient!vk;")
	public static final Class616 aClass616_2 = new Class616(1);

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "Lclient!vk;")
	public static final Class616 aClass616_3 = new Class616(4);

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "(Ljava/lang/CharSequence;B)I")
	public static int method32271(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) byte arg1) {
		return Class618.method32284(arg0, 10, true, 1155189549);
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(I)V")
	Class616(@OriginalArg(0) int arg0) {
	}
}