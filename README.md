# WatchFaces

Three Wear OS watch faces in the Watch Face Format (no app code, drawn by the watch from `res/raw/watchface.xml`).

| Face | Look |
|---|---|
| Midnight Satin | black satin dial, silver hands, red seconds hand |
| Blue Satin | black-to-navy satin dial, gold hands, red seconds hand |
| Skeleton Black | satin ring around an open dial showing the movement, silver hands |

All three show heart rate at 9 o'clock and battery level at 3 o'clock in date-style windows, and a swinging balance wheel (4 beats a second). The seconds hand can be turned off under Customize on the watch.

Each face is its own app because the format allows one face per app. Pushing to `main` builds all three APKs (GitHub Actions, "Build watch faces").

## 0.1.0

First build. Written from the Watch Face Format reference and not yet tried on a watch: heart rate, the seconds-hand option, the balance wheel animation and the always-on (ambient) look are all unconfirmed.
