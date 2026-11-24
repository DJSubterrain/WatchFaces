# WatchFaces

Four Wear OS watch faces in the Watch Face Format (no app code, drawn by the watch from `res/raw/watchface.xml`).

| Face | Look |
|---|---|
| Midnight Satin | black satin dial, silver hands, red seconds hand |
| Blue Satin | black-to-navy satin dial, gold hands, red seconds hand |
| Skeleton Black | satin ring around an open dial showing the movement, silver hands |
| Open Heart | navy satin dial with a large open-heart window onto the balance wheel, silver hands |

All four show heart rate at 9 o'clock and battery level at 3 o'clock in date-style windows, and a balance wheel that swings back and forth once a second. Under Customize on the watch you can turn the seconds hand on/off.

Each face is its own app because the format allows one face per app. Pushing to `main` builds all four APKs (GitHub Actions, "Build watch faces").

## 0.1.0

First build. Written from the Watch Face Format reference and not yet tried on a watch: heart rate, the seconds-hand option, the balance wheel animation and the always-on (ambient) look are all unconfirmed.

## 0.2.0

New Open Heart face; wheel swings once per second (was 4 Hz); metal frames around the windows and movement aperture are now optional and off by default. Not yet tried on a watch.

## 0.2.1

The outer metal ring (the "case") is now part of the optional frames and is off by default, so the dial runs to the edge of the screen and the watch's own body shows instead.

## 0.2.2

The metal case ring and window frames are removed from all faces (no switch). The dial runs to the screen edge.

## 0.2.3

Hour markers and the minute track moved out to the screen edge now that the metal ring is gone.
