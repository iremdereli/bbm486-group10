FROM node:14
RUN apt-get update
WORKDIR /app
COPY package.json .
RUN yarn install
COPY . .
CMD ["yarn","start"]