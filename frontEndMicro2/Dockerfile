#stage 1
FROM node:latest as node
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build --prod
FROM nginx:alpine 
COPY --from=node /app/dist/front-end-micro /usr/share/nginx/html
#COPY --from=node nginx.conf /etc/nginx/conf.d/default.conf