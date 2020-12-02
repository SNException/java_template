// ---------------------------------------------------------------------
//
// Foobar
//
// Copyright (C) 2020 Niklas Schultz
// All rights reserved.
//
// This software source file is licensed under the terms of MIT license.
// For details, please read the LICENSE file.
//
// ---------------------------------------------------------------------

public final class Main {

    static {
        boolean developerMode = false;
        assert developerMode = true;
        if (developerMode)
            System.out.println("Running application in developer mode.");
    }

	public static void main(final String[] args) {
		System.out.println("Hello, world!");
	}
}
